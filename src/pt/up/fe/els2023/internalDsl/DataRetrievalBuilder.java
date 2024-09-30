package pt.up.fe.els2023.internalDsl;

import pt.up.fe.els2023.dataRetrieval.DataRetrieval;

import java.io.File;
import java.util.ArrayList;

public class DataRetrievalBuilder {

    File[] dirs;
    ArrayList<String> sourcePath;
    ArrayList<String> destPath;
    ArrayList<String> extractionPath;
    ArrayList<ArrayList<String>> keysToExtract;
    ArrayList<ArrayList<String>> renameKeys;
    ArrayList<String> filterRelatedRename;
    ArrayList<String> keyFilter;
    ArrayList<Integer> top, bottom;
    ArrayList<String> prefix;
    ArrayList<String> suffix;
    ArrayList<String> sumOf;
    ArrayList<String> averageOf;


    public DataRetrievalBuilder() {
        this.sourcePath = new ArrayList<>();
        this.destPath = new ArrayList<>();
        this.keysToExtract = new ArrayList<>();
        this.renameKeys = new ArrayList<>();
        this.filterRelatedRename = new ArrayList<>();
        this.extractionPath = new ArrayList<>();
        this.keyFilter = new ArrayList<>();
        this.top = new ArrayList<>();
        this.bottom = new ArrayList<>();
        this.prefix = new ArrayList<>();
        this.suffix = new ArrayList<>();
        this.sumOf = new ArrayList<>();
        this.averageOf = new ArrayList<>();
    }

    public DataRetrievalBuilder allFromDir(File[] dirs) {
        this.dirs = dirs;
        return this;
    }

    // sets the source path of the data to be retrieved
    public DataRetrievalBuilder from(String sourcePath) {
        this.sourcePath.add(sourcePath);
        this.destPath.add("");
        this.keysToExtract.add(new ArrayList<>());
        this.renameKeys.add(new ArrayList<>());
        this.filterRelatedRename.add("no");
        this.extractionPath.add("");
        this.keyFilter.add("");
        this.top.add(0);
        this.bottom.add(0);
        this.prefix.add("");
        this.suffix.add("");
        return this;
    }

    // sets the destination path of the data to be retrieved
    public DataRetrievalBuilder to(String destPath) {
        this.destPath.add(this.sourcePath.size() - 1, destPath);
        this.destPath.remove(this.sourcePath.size());
        return this;
    }

    // sets the keys of the pairs to retrieve
    public DataRetrievalBuilder get(ArrayList<String> keysToExtract) {
        this.keysToExtract.add(this.sourcePath.size() - 1, keysToExtract);
        this.keysToExtract.remove(this.sourcePath.size());
        return this;
    }

    // sets the names with which to rename the extracted keys when these are added to the table
    public DataRetrievalBuilder rename(ArrayList<String> renameKeys) {
        this.renameKeys.add(this.sourcePath.size() - 1, renameKeys);
        this.renameKeys.remove(this.sourcePath.size());
        return this;
    }

    // used when there is a global rename rule (like adding a suffix after every key)
    public DataRetrievalBuilder renameAll(String prefix, String suffix) {
        this.prefix.add(this.sourcePath.size() - 1, prefix);
        this.prefix.remove(this.sourcePath.size());
        this.suffix.add(this.sourcePath.size() - 1, suffix);
        this.suffix.remove(this.sourcePath.size());
        return this;
    }

    // used when there is a rename that depends on a filter
    public DataRetrievalBuilder filterRelatedRename() {
        this.filterRelatedRename.add(this.sourcePath.size() - 1, "yes");
        this.filterRelatedRename.remove(this.sourcePath.size());
        return this;
    }

    // sets the path of keys inside the file to reach the block where the keys to be retrieved are located
    public DataRetrievalBuilder fromInFile(String extractionPath) {
        this.extractionPath.add(this.sourcePath.size() - 1, extractionPath);
        this.extractionPath.remove(this.sourcePath.size());
        return this;
    }

    // sets the key that will act as filter to decide what is retrieved
    public DataRetrievalBuilder filter(String keyFilter) {
        this.keyFilter.add(this.sourcePath.size() - 1, keyFilter);
        this.keyFilter.remove(this.sourcePath.size());
        return this;
    }

    // sets the configuration to extract the top n values of the parameter set by filter()
    public DataRetrievalBuilder top(int n){
        this.top.add(this.sourcePath.size() - 1, n);
        this.top.remove(this.sourcePath.size());
        return this;
    }

    // sets the configuration to extract the bottom n values of the parameter set by filter()
    public DataRetrievalBuilder bottom(int n){
        this.bottom.add(this.sourcePath.size() - 1, n);
        this.bottom.remove(this.sourcePath.size());
        return this;
    }

    // sets the flag to add a row with the sum of all values of a column, for all columns
    public DataRetrievalBuilder sumOf(String sumOf) {
        ArrayList<String> all = new ArrayList<>();
        all.add(sumOf);
        this.sumOf = all;
        return this;
    }

    // sets the list of columns where a row with the sum of all values should be added
    public DataRetrievalBuilder sumOf(ArrayList<String> sumOf) {
        this.sumOf = sumOf;
        return this;
    }

    // sets the flag to add a row with the average of all values of a column, for all columns
    public DataRetrievalBuilder averageOf(String averageOf) {
        ArrayList<String> all = new ArrayList<>();
        all.add(averageOf);
        this.averageOf = all;
        return this;
    }

    // sets the list of columns where a row with the average of all values should be added
    public DataRetrievalBuilder averageOf(ArrayList<String> averageOf) {
        this.averageOf = averageOf;
        return this;
    }

    // to use after a configuration ends for purposes of readability
    public DataRetrievalBuilder end() {
        return this;
    }

    // builds a DataRetrieval object according to the specified configuration
    public DataRetrieval build() {
        return new DataRetrieval(this.dirs, this.sourcePath, this.destPath, this.extractionPath, this.keysToExtract, this.renameKeys, this.filterRelatedRename, this.prefix, this.suffix, this.keyFilter, this.top, this.bottom, this.sumOf, this.averageOf, this.sourcePath.size());
    }
}

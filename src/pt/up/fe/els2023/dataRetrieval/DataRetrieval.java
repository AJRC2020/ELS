package pt.up.fe.els2023.dataRetrieval;

import org.checkerframework.checker.units.qual.A;
import org.xml.sax.SAXException;
import pt.up.fe.els2023.exporter.CsvExporter;
import pt.up.fe.els2023.exporter.Exporter;
import pt.up.fe.els2023.exporter.HtmlExporter;
import pt.up.fe.els2023.table.Table;
import pt.up.fe.els2023.extractor.Extractor;
import pt.up.fe.els2023.extractor.JsonExtractor;
import pt.up.fe.els2023.extractor.XmlExtractor;
import pt.up.fe.els2023.extractor.YamlExtractor;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DataRetrieval {

    File[] dirs;
    ArrayList<String> sourcePath;
    ArrayList<String> destPath;
    ArrayList<String> extractionPath;
    ArrayList<ArrayList<String>> keysToExtract;
    ArrayList<ArrayList<String>> renameKeys;
    ArrayList<String> filterRelatedRename;
    ArrayList<String> prefix;
    ArrayList<String> suffix;
    ArrayList<String> keyFilter;
    ArrayList<Table> extractedData;
    ArrayList<Table> dataFromAllDirs;
    ArrayList<Integer> top, bottom;
    ArrayList<String> sumOf;
    ArrayList<String> averageOf;

    int numOperations;

    public DataRetrieval(File[] dirs, ArrayList<String> sourcePath, ArrayList<String> destPath, ArrayList<String> extractionPath, ArrayList<ArrayList<String>> keysToExtract, ArrayList<ArrayList<String>> renameKeys, ArrayList<String> filterRelatedRename, ArrayList<String> prefix, ArrayList<String> suffix, ArrayList<String> keyFilter, ArrayList<Integer> top, ArrayList<Integer> bottom, ArrayList<String> sumOf, ArrayList<String> averageOf, Integer numOperations) {
        this.dirs = dirs;
        this.sourcePath = sourcePath;
        this.destPath = destPath;
        this.extractionPath = extractionPath;
        this.keysToExtract = keysToExtract;
        this.renameKeys = renameKeys;
        this.filterRelatedRename = filterRelatedRename;
        this.prefix = prefix;
        this.suffix = suffix;
        this.keyFilter = keyFilter;
        this.top = top;
        this.bottom = bottom;
        this.sumOf = sumOf;
        this.averageOf = averageOf;
        this.numOperations = numOperations;
        this.extractedData = new ArrayList<>();
        this.dataFromAllDirs = new ArrayList<>();
    }

    public Table execute() throws IOException, ParserConfigurationException, SAXException {
        ArrayList<String> exportDestPaths = new ArrayList<>();
        exportDestPaths.add(this.destPath.get(0));

        ArrayList<Table> exportTables = new ArrayList<>();

        if (this.dirs != null) {
            String[] parsedPath = {};
            String dirName;
            Arrays.sort(this.dirs);
            for (File dir: this.dirs) {
                if (dir.toString().contains("/")) {
                    parsedPath = dir.toString().split("/");
                    dirName = parsedPath[parsedPath.length - 1];
                }
                else {
                    dirName = dir.toString();
                }
                for (int i = 0; i < numOperations; i++) {
                    this.extract(i, dir.toString());
                    if (this.keyFilter.get(i) != "") {
                        this.filter(i);
                    }
                }

                for (int i = 0; i < this.extractedData.size(); i++) {
                    if (!this.renameKeys.get(i).isEmpty() && this.filterRelatedRename.get(i).equals("no")) {
                        this.rename(i);
                    }

                    if (this.prefix.get(i) != "" || this.suffix.get(i) != "") {
                        this.renameAll(i);
                    }
                }

                for (int i = 0; i < numOperations; i++) {
                    if (this.extractedData.get(i) != null) {
                        if (numOperations == 1) {
                            exportTables.add(this.extractedData.get(0));
                        }
                        else {
                            for (int j = i + 1; j < numOperations; j++) {
                                if (this.destPath.get(i).equals(this.destPath.get(j))) {
                                    exportTables.add(i, this.extractedData.get(i).concat(this.extractedData.get(j)));
                                    if (exportTables.size() > i + 1) {
                                        exportTables.remove(i + 1);
                                    }
                                    this.extractedData.remove(j);
                                    this.extractedData.add(j, null);
                                }
                                else {
                                    exportDestPaths.add(this.destPath.get(j));
                                    exportTables.add(this.extractedData.get(j));
                                }
                            }
                        }
                    }
                }

                ArrayList<String> dirHeader = new ArrayList<>();
                ArrayList<String> dirCol = new ArrayList<>();
                dirHeader.add("Folder Name");
                dirCol.add(dirName);
                Table dirNameTable = new Table(dirHeader);
                dirNameTable.addRow(dirCol);
                if (this.dataFromAllDirs.isEmpty()) {
                    this.dataFromAllDirs.add(dirNameTable.concat(exportTables.get(0)));
                }
                else {
                    this.dataFromAllDirs.add(0, this.dataFromAllDirs.get(0).concat(dirNameTable.concat(exportTables.get(0))));
                }
                this.extractedData.clear();
            }

            if (!this.sumOf.isEmpty()) {
                sum();
            }
            if (!this.averageOf.isEmpty()) {
                average();
            }

            export(this.dataFromAllDirs.get(0), exportDestPaths.get(0));

            return this.dataFromAllDirs.get(0);
        }

        else {
            String[] parsedSourcePath = {};
            String sourceDirName;

            parsedSourcePath = this.sourcePath.get(0).split("/");
            sourceDirName = parsedSourcePath[parsedSourcePath.length - 2];

            for (int i = 0; i < numOperations; i++) {
                this.extract(i, "");
                if (this.keyFilter.get(i) != "") {
                    this.filter(i);
                }
            }

            for (int i = 0; i < this.extractedData.size(); i++) {
                if (!this.renameKeys.get(i).isEmpty()) {
                    this.rename(i);
                }

                if (this.prefix.get(i) != "" || this.suffix.get(i) != "") {
                    this.renameAll(i);
                }
            }

            for (int i = 0; i < numOperations; i++) {
                if (this.extractedData.get(i) != null) {
                    if (numOperations == 1) {
                        exportTables.add(this.extractedData.get(0));
                    }
                    else {
                        for (int j = i + 1; j < numOperations; j++) {
                            if (this.destPath.get(i).equals(this.destPath.get(j))) {
                                exportTables.add(i, this.extractedData.get(i).concat(this.extractedData.get(j)));
                                if (exportTables.size() > i + 1) {
                                    exportTables.remove(i + 1);
                                }
                                this.extractedData.remove(j);
                                this.extractedData.add(j, null);
                            }
                            else {
                                exportDestPaths.add(this.destPath.get(j));
                                exportTables.add(this.extractedData.get(j));
                            }
                        }
                    }
                }
            }
            ArrayList<String> dirHeader = new ArrayList<>();
            ArrayList<String> dirCol = new ArrayList<>();
            dirHeader.add("Folder Name");
            dirCol.add(sourceDirName);
            Table dirNameTable = new Table(dirHeader);
            dirNameTable.addRow(dirCol);

            export(dirNameTable.concat(exportTables.get(0)), exportDestPaths.get(0));

            dirNameTable.concat(exportTables.get(0)).print();

            return dirNameTable.concat(exportTables.get(0));
        }
    }

    private void extract(int index, String dirPath) throws IOException, ParserConfigurationException, SAXException {
        if (this.sourcePath.get(index).contains(".json")) {
            extractJson(index, dirPath);
        }
        else if (this.sourcePath.get(index).contains(".xml")) {
            extractXml(index, dirPath);
        }
        else if (this.sourcePath.get(index).contains(".yaml") || this.sourcePath.get(index).contains(".yml")) {
            extractYaml(index, dirPath);
        }
    }

    private void extractJson(int index, String dirPath) throws IOException, ParserConfigurationException, SAXException {
        Extractor extractor;

        if (dirPath != "") {
            extractor = new JsonExtractor(dirPath + "/" + this.sourcePath.get(index), this.extractionPath.get(index), this.keysToExtract.get(index));
        }
        else {
            extractor = new JsonExtractor(this.sourcePath.get(index), this.extractionPath.get(index), this.keysToExtract.get(index));
        }
        this.extractedData.add(extractor.execute());
    }

    private void extractXml(int index, String dirPath) throws IOException, ParserConfigurationException, SAXException {
        Extractor extractor;

        if (dirPath != "") {
            extractor = new XmlExtractor(dirPath + "/" + this.sourcePath.get(index), this.extractionPath.get(index), this.keysToExtract.get(index));
        }
        else {
            extractor = new XmlExtractor(this.sourcePath.get(index), this.extractionPath.get(index), this.keysToExtract.get(index));
        }
        this.extractedData.add(extractor.execute());
    }

    private void extractYaml(int index, String dirPath) throws IOException, ParserConfigurationException, SAXException {
        Extractor extractor;

        if (dirPath != "") {
            extractor = new YamlExtractor(dirPath + "/" + this.sourcePath.get(index), this.extractionPath.get(index), this.keysToExtract.get(index));
        }
        else {
            extractor = new YamlExtractor(this.sourcePath.get(index), this.extractionPath.get(index), this.keysToExtract.get(index));
        }
        this.extractedData.add(extractor.execute());
    }

    private void rename(int index) {
        ArrayList<String> renamedHeaders;
        Table table, newTable;
        String currRename;

        table = this.extractedData.get(index);
        renamedHeaders = new ArrayList<>();
        for (int i = 0; i < table.getHeaders().size(); i++) {
            currRename = this.renameKeys.get(index).get(i);
            if (currRename != "") {
                renamedHeaders.add(currRename);
            }
            else {
                renamedHeaders.add(table.getHeader(i));
            }
        }
        newTable = new Table(renamedHeaders);
        for (var row: table.getTable()) {
            newTable.addRow(row);
        }
        this.extractedData.remove(index);
        this.extractedData.add(index, newTable);
    }

    private void renameAll(int index) {
        ArrayList<String> renamedHeaders;
        Table table, newTable;

        table = this.extractedData.get(index);
        renamedHeaders = new ArrayList<>();
        for (String header: table.getHeaders()) {
            if (this.prefix.get(index) != "") {
                renamedHeaders.add(this.prefix.get(index) + header);
            }

            if (this.suffix.get(index) != "") {
                renamedHeaders.add(header + this.suffix.get(index));
            }
        }
        newTable = new Table(renamedHeaders);
        for (var row: table.getTable()) {
            newTable.addRow(row);
        }
        this.extractedData.remove(index);
        this.extractedData.add(index, newTable);
    }

    private void filter(int index) {
        Table filteredData = new Table();
        ArrayList<String> rowToAdd = new ArrayList<>();

        if (this.top.get(index) != 0) {
            this.extractedData.get(index).sortNumerical(this.keyFilter.get(index), true);
            for (int i = 0; i < this.top.get(index); i++) {
                if (this.filterRelatedRename.get(index).equals("yes")) {
                    for (int j = 0; j < this.renameKeys.get(index).size(); j++) {
                        filteredData.addHeader(this.renameKeys.get(index).get(j) + (i+1));
                        rowToAdd.add(this.extractedData.get(index).getItem(i, j));
                    }
                }
            }
            filteredData.addRow(rowToAdd);
            this.extractedData.remove(index);
            if (this.filterRelatedRename.get(index).equals("yes")) {
                this.extractedData.add(index, filteredData);
            }
        }
        else if (this.bottom.get(index) != 0) {
            this.extractedData.get(index).sortNumerical(this.keyFilter.get(index), false);
            for (int i = 0; i < this.bottom.get(index); i++) {
                if (this.filterRelatedRename.get(index).equals("yes")) {
                    for (int j = 0; j < this.renameKeys.get(index).size(); j++) {
                        filteredData.addHeader(this.renameKeys.get(index).get(j) + (i+1));
                        rowToAdd.add(this.extractedData.get(index).getItem(i, j));
                    }
                }
            }
            filteredData.addRow(rowToAdd);
            this.extractedData.remove(index);
            if (this.filterRelatedRename.get(index).equals("yes")) {
                this.extractedData.add(index, filteredData);
            }
        }
    }

    private void sum() {
        ArrayList<String> results = new ArrayList<>();
        Double result;

        if (this.sumOf.get(0).equals("all")) {
            for (int i = 1; i < this.dataFromAllDirs.get(0).getHeaders().size(); i++) {
                result = this.dataFromAllDirs.get(0).sumCol(this.dataFromAllDirs.get(0).getHeader(i));
                if (result == -1) {
                    results.add("");
                }
                else {
                    results.add(result.toString());
                }
            }
        }
        else {
            for (int i = 1; i < this.dataFromAllDirs.get(0).getHeaders().size(); i++) {
                if (this.sumOf.contains(this.dataFromAllDirs.get(0).getHeader(i))) {
                    result = this.dataFromAllDirs.get(0).sumCol(this.dataFromAllDirs.get(0).getHeader(i));
                    if (result == -1) {
                        results.add("");
                    }
                    else {
                        results.add(result.toString());
                    }
                }
                else {
                    results.add("");
                }
            }
        }

        results.add(0, "Total");
        Table temp = this.dataFromAllDirs.get(0);
        temp.addRow(results);
        this.dataFromAllDirs.remove(0);
        this.dataFromAllDirs.add(0, temp);
    }

    private void average() {
        ArrayList<String> results = new ArrayList<>();
        Double result;

        if (this.averageOf.get(0).equals("all")) {
            for (int i = 1; i < this.dataFromAllDirs.get(0).getHeaders().size(); i++) {
                result = this.dataFromAllDirs.get(0).averageCol(this.dataFromAllDirs.get(0).getHeader(i));
                if (result == -1) {
                    results.add("");
                }
                else {
                    results.add(result.toString());
                }
            }
        }
        else {
            for (int i = 1; i < this.dataFromAllDirs.get(0).getHeaders().size(); i++) {
                if (this.averageOf.contains(this.dataFromAllDirs.get(0).getHeader(i))) {
                    result = this.dataFromAllDirs.get(0).averageCol(this.dataFromAllDirs.get(0).getHeader(i));
                    if (result == -1) {
                        results.add("");
                    }
                    else {
                        results.add(result.toString());
                    }
                }
                else {
                    results.add("");
                }
            }
        }

        results.add(0, "Average");
        Table temp = this.dataFromAllDirs.get(0);
        temp.addRow(results);
        this.dataFromAllDirs.remove(0);
        this.dataFromAllDirs.add(0, temp);
    }

    private void export(Table table, String path) throws IOException {
        if (path.contains(".csv")) {
            exportCsv(table, path);
        }
        else if (path.contains(".html")) {
            exportHtml(table, path);
        }
        else {
            throw new RuntimeException("Path does not contain valid file extension.");
        }
    }

    private void exportCsv(Table table, String path) throws IOException {
        Exporter exporter = new CsvExporter(table, path);
        exporter.write();
    }

    private void exportHtml(Table table, String path) throws IOException {
        Exporter exporter = new HtmlExporter(table, path);
        exporter.write();
    }
}

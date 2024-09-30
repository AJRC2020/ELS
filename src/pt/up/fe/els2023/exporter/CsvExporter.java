package pt.up.fe.els2023.exporter;

import com.opencsv.CSVWriter;
import pt.up.fe.els2023.config.FileData;
import pt.up.fe.els2023.table.Table;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvExporter extends Exporter {

    public CsvExporter(FileData fileConfig) {
        super(fileConfig);
    }

    public CsvExporter(Table table, String path) {
        super(table, path);
    }

    @Override
    public void write() throws IOException {
        File file = new File(this.path);

        FileWriter resultsFile = new FileWriter(file);

        CSVWriter writer = new CSVWriter(resultsFile);

        this.writeHeaders(writer);
        this.writeValues(writer);

        writer.close();
    }

    public void writeHeaders(CSVWriter writer) {
        String[] stringHeaders = this.arrayListToString(this.table.getHeaders());
        writer.writeNext(stringHeaders);
    }

    public void writeValues(CSVWriter writer) {
        for (ArrayList<String> row: this.table.getTable()) {
            String[] stringData = this.arrayListToString(row);
            writer.writeNext(stringData);
        }
    }

    protected String[] arrayListToString(ArrayList toConvert) {

        String[] result = new String[toConvert.size()];

        for (int i = 0; i < toConvert.size(); i++) {
            result[i] = toConvert.get(i).toString();
        }

        return result;
    }
}

package pt.up.fe.els2023.exporter;

import pt.up.fe.els2023.config.FileData;
import pt.up.fe.els2023.table.Table;

import java.io.IOException;
import java.util.List;

public abstract class Exporter {

    List<FileData.Column> columns;

    Table table;
    String path;

    public Exporter(FileData fileConfig) {
        this.columns = fileConfig.getColumns();
    }

    public Exporter(Table table, String path) {
        this.table = table;
        this.path = path;
    }

    public abstract void write() throws IOException;
}

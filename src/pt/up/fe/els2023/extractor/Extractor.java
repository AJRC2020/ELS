package pt.up.fe.els2023.extractor;

import org.xml.sax.SAXException;
import pt.up.fe.els2023.config.FileData;
import pt.up.fe.els2023.table.Table;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Extractor {

    FileData fileConfig;
    String sourcePath;
    List<FileData.Column> columns;
    String extractionPath;
    ArrayList<String> keysToExtract;

    public Extractor(FileData fileConfig) {
        this.fileConfig = fileConfig;
        this.sourcePath = fileConfig.getSource();
        this.columns = fileConfig.getColumns();
    }

    public Extractor(String sourcePath, String extractionPath, ArrayList<String> keysToExtract) {
        this.sourcePath = sourcePath;
        this.extractionPath = extractionPath;
        this.keysToExtract = keysToExtract;
    }

    public abstract Table execute() throws IOException, ParserConfigurationException, SAXException;

    public abstract void createExtractor() throws IOException, ParserConfigurationException, SAXException;

    public abstract Table extractData();
}

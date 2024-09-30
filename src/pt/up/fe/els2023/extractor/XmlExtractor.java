package pt.up.fe.els2023.extractor;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import pt.up.fe.els2023.config.FileData;
import pt.up.fe.els2023.table.Table;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;

public class XmlExtractor extends Extractor {

    Document xml;


    //this extractor is reserved for configuration files?
    public XmlExtractor(FileData fileConfig) {
        super(fileConfig);
    }

    public XmlExtractor(String sourcePath, String extractionPath, ArrayList<String> keysToExtract) {
        super(sourcePath, extractionPath, keysToExtract);
    }

    @Override
    public Table execute() throws IOException, ParserConfigurationException, SAXException {
        this.createExtractor();
        Table result = this.extractData();

        return result;
    }

    @Override
    public void createExtractor() throws IOException, ParserConfigurationException, SAXException {
        File file = new File(this.sourcePath);

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        this.xml = db.parse(file);
        this.xml.getDocumentElement().normalize();
    }

    @Override
    public Table extractData() {
        Table result = new Table();
        String[] parsedPath = {};
        NodeList list = null;
        ArrayList<String> row = new ArrayList<>();

        if (this.extractionPath.contains("/")) {
            parsedPath = this.extractionPath.split("/");
        }

        list = this.xml.getElementsByTagName(parsedPath[0]);

        if (parsedPath.length > 1) {
            list = list.item(0).getChildNodes();
            for (int i = 1; i < parsedPath.length; i++) {
                for (int j = 1; j < list.getLength(); j++) {
                    if (list.item(j).getNodeName().equals(parsedPath[i])) {
                        list = list.item(j).getChildNodes();
                        break;
                    }
                }
            }
        }

        for (int i = 1; i < list.getLength(); i++) {
            String key = list.item(i).getNodeName();
            if (key != "#text") {
                if (this.keysToExtract.isEmpty()) {
                    if (!result.getHeaders().contains(key)) {
                        result.addHeader(key);
                    }
                    row.add(list.item(i).getTextContent());
                }
                else {
                    for (int j = 0; j < this.keysToExtract.size(); j++) {
                        if (this.keysToExtract.get(j).equals(key)) {
                            if (!result.getHeaders().contains(this.keysToExtract.get(j))) {
                                result.addHeader(this.keysToExtract.get(j));
                            }
                            row.add(list.item(i).getTextContent());
                            break;
                        }
                    }
                }
            }
        }

        result.addRow(row);
        return result;
    }
}

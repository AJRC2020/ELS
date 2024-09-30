package pt.up.fe.els2023.extractor;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import pt.up.fe.els2023.config.FileData;
import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2023.table.Table;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.*;

public class YamlExtractor extends Extractor {

    private Map<String, Object> data;

    public YamlExtractor(FileData fileConfig) {
        super(fileConfig);
    }

    public YamlExtractor(String sourcePath, String extractionPath, ArrayList<String> keysToExtract) {
        super(sourcePath, extractionPath, keysToExtract);
    }

    @Override
    public Table execute() {
        this.createExtractor();
        Table result = this.extractData();

        return result;
    }

    @Override
    public void createExtractor() {
        try {
            Yaml yaml = new Yaml();
            FileInputStream inputStream = new FileInputStream(this.sourcePath);
            this.data = yaml.load(inputStream);
        } catch (IOException e) {
            System.err.println("Error reading the YAML file: " + e.getMessage());
        }
    }

    @Override
    public Table extractData() {
        Table result = new Table();
        ArrayList<String> row = new ArrayList<>();
        String[] parsedPath = {};

        if (this.extractionPath.contains("/")) {
            parsedPath = this.extractionPath.split("/");
        }

        String keyToFind;
        Integer leftToFind;

        if (parsedPath.length == 0) {
            keyToFind = this.extractionPath;
            leftToFind = 1;
        }
        else {
            keyToFind = parsedPath[0];
            leftToFind = parsedPath.length;
        }

        Map<String, Object> currLevelData = data;

        if (this.extractionPath.isEmpty()) {
            for (String key: currLevelData.keySet()) {
                if (this.keysToExtract.isEmpty()) {
                    var currentBlock = data.get(key);
                    if (currentBlock instanceof Integer || currentBlock instanceof String) {
                        result.addHeader(key);
                        row.add(currentBlock.toString());
                    }
                    else if (currentBlock instanceof LinkedHashMap<?,?>) {
                        for (Object key2: ((LinkedHashMap<?, ?>) currentBlock).keySet()) {
                            var currentBlock2 = ((LinkedHashMap<?, ?>) currentBlock).get(key2);
                            if (currentBlock2 instanceof Integer || currentBlock2 instanceof String) {
                                result.addHeader(key2.toString());
                                row.add(currentBlock2.toString());
                            }
                        }
                    }
                }
                else {
                    for (int i = 0; i < keysToExtract.size(); i++) {
                        if (this.keysToExtract.get(i).equals(key)) {
                            var currentBlock = data.get(key);
                            if (currentBlock instanceof Integer || currentBlock instanceof String) {
                                result.addHeader(key);
                                row.add(currentBlock.toString());
                            }
                            else if (currentBlock instanceof LinkedHashMap<?,?>) {
                                for (Object key2: ((LinkedHashMap<?, ?>) currentBlock).keySet()) {
                                    var currentBlock2 = ((LinkedHashMap<?, ?>) currentBlock).get(key2);
                                    if (currentBlock2 instanceof Integer || currentBlock2 instanceof String) {
                                        result.addHeader(key2.toString());
                                        row.add(currentBlock2.toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            while (leftToFind > 0) {
                for (String key: currLevelData.keySet()) {
                    if (keyToFind.equals(key)) {
                        currLevelData = (Map<String, Object>) currLevelData.get(key);
                        leftToFind--;
                        if (leftToFind != 0) {
                            keyToFind = parsedPath[parsedPath.length - leftToFind];
                            break;
                        }
                        for (String currLevelKey: currLevelData.keySet()) {
                            if (this.keysToExtract.isEmpty()) {
                                var currentBlock = currLevelData.get(currLevelKey);
                                if (currentBlock instanceof Integer || currentBlock instanceof String) {
                                    result.addHeader(currLevelKey);
                                    row.add(currentBlock.toString());
                                }
                                else if (currentBlock instanceof LinkedHashMap<?,?>) {
                                    for (Object key2: ((LinkedHashMap<?, ?>) currentBlock).keySet()) {
                                        var currentBlock2 = ((LinkedHashMap<?, ?>) currentBlock).get(key2);
                                        if (currentBlock2 instanceof Integer || currentBlock2 instanceof String) {
                                            result.addHeader(key2.toString());
                                            row.add(currentBlock2.toString());
                                        }
                                    }
                                }
                            }
                            else {
                                for (int i = 0; i < keysToExtract.size(); i++) {
                                    if (this.keysToExtract.get(i).equals(currLevelKey)) {
                                        var currentBlock = currLevelData.get(currLevelKey);
                                        if (currentBlock instanceof Integer || currentBlock instanceof String) {
                                            result.addHeader(currLevelKey);
                                            row.add(currentBlock.toString());
                                        }
                                        else if (currentBlock instanceof LinkedHashMap<?,?>) {
                                            for (Object key2: ((LinkedHashMap<?, ?>) currentBlock).keySet()) {
                                                var currentBlock2 = ((LinkedHashMap<?, ?>) currentBlock).get(key2);
                                                if (currentBlock2 instanceof Integer || currentBlock2 instanceof String) {
                                                    result.addHeader(key2.toString());
                                                    row.add(currentBlock2.toString());
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
        result.addRow(row);
        return result;
    }
}
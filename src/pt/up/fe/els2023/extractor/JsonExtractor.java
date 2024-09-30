package pt.up.fe.els2023.extractor;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import pt.up.fe.els2023.config.FileData;
import pt.up.fe.els2023.table.Table;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class JsonExtractor extends Extractor {

    Map<String, ArrayList> data;

    public JsonExtractor(FileData fileConfig) {
        super(fileConfig);
    }

    public JsonExtractor(String sourcePath, String extractionPath, ArrayList<String> keysToExtract) {
        super(sourcePath, extractionPath, keysToExtract);
    }

    @Override
    public Table execute() throws FileNotFoundException {
        this.createExtractor();
        Table result = this.extractData();

        return result;
    }

    @Override
    public void createExtractor() throws FileNotFoundException {
        try{
            Gson gson = new Gson();
            FileReader jsonConfig = new FileReader(this.sourcePath);
            this.data = gson.fromJson(jsonConfig, Map.class);
        } catch (IOException e) {
            throw e;
        }
    }

    @Override
    public Table extractData() {
        Table result = new Table();

        for (String key: this.data.keySet()) {
            if (Objects.equals(key, this.extractionPath) || this.extractionPath == "") {
                ArrayList extracted = this.data.get(key);
                for (Object extractedParams : extracted) {
                    ArrayList row = new ArrayList();
                    LinkedTreeMap extractedParamsMap = (LinkedTreeMap) extractedParams;
                    for (Object key2: extractedParamsMap.keySet()) {
                        if (this.keysToExtract.isEmpty()) {
                            if (!result.getHeaders().contains(key2)) {
                                result.addHeader((String) key2);
                            }
                            row.add(extractedParamsMap.get(key2).toString());
                        }
                        else {
                            for (int i = 0; i < this.keysToExtract.size(); i++) {
                                if (this.keysToExtract.get(i).equals(key2)) {
                                    if (!result.getHeaders().contains(this.keysToExtract.get(i))) {
                                        result.addHeader(this.keysToExtract.get(i));
                                    }
                                    row.add(extractedParamsMap.get(key2).toString());
                                    break;
                                }
                            }
                        }
                    }
                    result.addRow(row);
                }
            }
        }

        return result;
    }
}

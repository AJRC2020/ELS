package pt.up.fe.els2023.config;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConfigReader {
    public static List<FileData> readConfig (String filepath) throws IOException {
        try{
            Gson gson = new Gson();
            FileReader jsonConfig = new FileReader(filepath);
            Map<String, LinkedTreeMap> jsonMapper = gson.fromJson(jsonConfig, Map.class);

            List<FileData> fileData = new ArrayList<>();
            for (var fileName : jsonMapper.keySet()) {
                var newFileData = new FileData();
                var currentFile = jsonMapper.get(fileName);

                newFileData.setSource((String) currentFile.get("source"));

                var columnsArray = (ArrayList) currentFile.get("columns");

                var columnsList = new ArrayList<FileData.Column>();
                for (var column: columnsArray){
                    var map = (Map) column;
                    var newColumn = new FileData.Column();
                    newColumn.setKey((String) map.get("key"));
                    newColumn.setName((String) map.get("name"));
                    newColumn.setRename((String) map.get("rename"));
                    columnsList.add(newColumn);
                }

                newFileData.setColumns(columnsList);
                fileData.add(newFileData);
            }
            return fileData;
        } catch (IOException e) {
            throw e;
        }
    }
}

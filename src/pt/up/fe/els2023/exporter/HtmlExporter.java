package pt.up.fe.els2023.exporter;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import pt.up.fe.els2023.config.FileData;
import pt.up.fe.els2023.table.Table;

import java.io.*;


public class HtmlExporter extends Exporter {
    private final VelocityEngine engine;
    private final VelocityContext context;

    public HtmlExporter(FileData fileConfig) {
        super(fileConfig);
        engine = new VelocityEngine();
        engine.init();
        context = new VelocityContext();
    }

    public HtmlExporter(Table table, String path) {
        super(table, path);
        engine = new VelocityEngine();
        engine.init();
        context = new VelocityContext();
    }

    @Override
    public void write() {
        writeHeaders();
        writeValues();
        String customHtml = applyTemplate();
        writeToFile(customHtml);
    }


    public void writeHeaders() {
        context.put("title", "Data Table");

        StringBuilder builder = new StringBuilder();
        builder.append("<tr>").append(System.lineSeparator());

        for(var header: this.table.getHeaders()){
            builder.append("<th>")
                .append(header)
                .append("</th>")
                .append(System.lineSeparator());
        }

        builder.append("</tr>").append(System.lineSeparator());

        context.put("tableHeader", builder.toString());
    }

    public void writeValues() {
        String[] parsedPath = this.path.split("/");

        StringBuilder builder = new StringBuilder();
        builder.append("<tr>").append(System.lineSeparator());

        for (var row: this.table.getTable()) {
            for(var item: row){
                builder.append("<td>")
                        .append(item)
                        .append("</td>")
                        .append(System.lineSeparator());
            }
            builder.append("</tr>").append(System.lineSeparator());
        }

        context.put("tableRows", builder.toString());
    }

    private String applyTemplate(){
        String templatePath = "/templates/tableTemplate.vm";
        StringWriter customHtml = new StringWriter();
        engine.mergeTemplate(templatePath, "UTF-8", context, customHtml);
        return customHtml.toString();
    }

    private void writeToFile(String customHtml) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.path))) {
            writer.write(customHtml);
            System.out.println("Written HTML table to a file!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package pt.up.fe.els2023.table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Table {
    ArrayList<String> headers;
    ArrayList<ArrayList<String>> table;

    public Table() {
        this.headers = new ArrayList<>();
        this.table = new ArrayList<>();
    }

    public Table(ArrayList<String> headers) {
        this.headers = headers;
        this.table = new ArrayList<>();
    }

    public void addHeader(String header) {
        this.headers.add(header);
    }

    public void addRow(ArrayList row) {
        this.table.add(row);
    }

    public void addItem(String item, int row) {
        this.table.get(row).add(item);
    }

    public ArrayList<ArrayList<String>> getTable() {
        return this.table;
    }

    public ArrayList<String> getRow(int row) {
        return this.table.get(row);
    }

    public String getItem(int row, int item) {
        return this.table.get(row).get(item);
    }

    public ArrayList<String> getHeaders() {
        return this.headers;
    }

    public String getHeader(int header) {
        return this.headers.get(header);
    }

    public int getHeaderIndexByName(String header) {
        int headerIndex = -1;

        for (int i = 0; i < this.headers.size(); i++) {
            if (Objects.equals(this.headers.get(i), header)) {
                headerIndex = i;
                break;
            }
        }

        return headerIndex;
    }

    public void sortNumerical(String header, boolean reverse) {
        int headerIndex = this.getHeaderIndexByName(header);

        if (headerIndex > -1) {
            int finalHeaderIndex = headerIndex;
            Comparator<ArrayList<String>> rowComparator = new Comparator<ArrayList<String>>() {
                @Override
                public int compare(ArrayList<String> row1, ArrayList<String> row2) {
                    float value1 = Float.parseFloat(row1.get(finalHeaderIndex));
                    float value2 = Float.parseFloat(row2.get(finalHeaderIndex));

                    return Float.compare(value1, value2);
                }
            };

            Collections.sort(this.table, rowComparator);

            if (reverse) {
                Collections.reverse(this.table);
            }
        }
    }

    public void filterNumerical(String header, int filterType, float compareValue) {
        ArrayList<ArrayList<String>> newTable = new ArrayList<>();

        int headerIndex = getHeaderIndexByName(header);

        if (headerIndex > -1) {
            for (ArrayList<String> row : this.table) {
                for (int i = 0; i < row.size(); i++) {
                    if (i == headerIndex) {
                        Float value = Float.parseFloat(row.get(i));
                        switch(filterType) {
                            case 0:
                                if (value > compareValue) {
                                    newTable.add(row);
                                }
                                break;

                            case 1:
                                if (value == compareValue) {
                                    newTable.add(row);
                                }
                                break;

                            case 2:
                                if (value < compareValue) {
                                    newTable.add(row);
                                }
                        }
                    }
                }
            }
        }

        this.table = newTable;
    }

    public boolean isEmpty() {
        return this.headers.isEmpty() && this.table.isEmpty();
    }

    public Table concat(Table toConcat) {// only works for tables with 100% different headers
        for (String header: toConcat.getHeaders()) {
            int headerIndex = this.getHeaderIndexByName(header);
            String valueToAdd = toConcat.getItem(0, toConcat.getHeaderIndexByName(header));
            if (headerIndex == -1) {
                this.addHeader(header);
                this.getRow(0).add(valueToAdd);
            }
            else {
                ArrayList<String> currLastRow = this.getRow(this.getTable().size() - 1);
                if (currLastRow.get(headerIndex).equals("")) {
                    currLastRow.remove(headerIndex);
                    currLastRow.add(headerIndex, valueToAdd);
                }
                else {
                    ArrayList<String> newRow = new ArrayList<>();
                    for (int i = 0; i < this.getHeaders().size(); i++) {
                        if (i == headerIndex) {
                            newRow.add(valueToAdd);
                        }
                        else {
                            newRow.add("");
                        }
                    }
                    this.addRow(newRow);
                }
            }
        }

        return this;
    }

    public Double sumCol(String col) {
        int index = getHeaderIndexByName(col);
        Double total = (double) 0;

        if (!isNumeric(this.getRow(0).get(index))) {
            return (double) -1;
        }
        for (ArrayList<String> row: this.getTable()) {
            if (!row.get(0).equals("Average") && isNumeric(row.get(index))) {
                total += Double.parseDouble(row.get(index));
            }
        }

        return total;
    }

    public Double averageCol(String col) {
        int index = getHeaderIndexByName(col);
        Double total = (double) 0;
        int num = 0;

        if (!isNumeric(this.getRow(0).get(index))) {
            return (double) -1;
        }
        for (ArrayList<String> row: this.getTable()) {
            if (!row.get(0).equals("Total") && isNumeric(row.get(index))) {
                total += Double.parseDouble(row.get(index));
                num++;
            }
        }

        return ((double) total / num);
    }

    public void print() {
        for (String header: this.headers) {
            System.out.print(header + " | ");
        }

        System.out.println();

        for (ArrayList row: this.table) {
            for (Object item: row) {
                System.out.print((String) item + " | ");
            }
            System.out.println();
        }
    }

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
    }
}

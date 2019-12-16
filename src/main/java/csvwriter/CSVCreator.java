package csvwriter;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;


public class CSVCreator {

    public void createCSVFile(String pathDestination, HashMap<String, String> table) throws IOException {
        Writer writer = Files.newBufferedWriter(Paths.get(pathDestination));
        try (
                CSVWriter csvWriter = new CSVWriter(writer,
                        CSVWriter.DEFAULT_SEPARATOR,
                        CSVWriter.NO_QUOTE_CHARACTER,
                        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                        CSVWriter.DEFAULT_LINE_END);) {
            csvWriter.writeNext(getColumns(table));
            csvWriter.writeNext(getValues(table));
        }
    }

    public String[] getColumns(HashMap<String, String> table) {
        Collection<String> columnsHeader = table.keySet();
        return columnsHeader.toArray(new String[columnsHeader.size()]);

    }

    public String[] getValues(HashMap<String, String> table) {
        Collection<String> columnsRows = table.values();
        return columnsRows.toArray(new String[columnsRows.size()]);
       }
}


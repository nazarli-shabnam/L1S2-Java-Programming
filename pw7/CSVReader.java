package pw7;

//exercise 1
import java.io.*;
import java.util.ArrayList;

public class CSVReader {
    private String fileName;
    private ArrayList<ArrayList<String>> entries;

    public CSVReader(String fileName) {
        this.fileName = fileName;
        this.entries = new ArrayList<>();
    }

    public void importData() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                ArrayList<String> entry = new ArrayList<>();
                for (String value : values) {
                    entry.add(value);
                }
                entries.add(entry);
            }
        }
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public ArrayList<String> getEntry(int i) {
        if (i >= 0 && i < entries.size()) {
            return entries.get(i);
        }
        throw new IndexOutOfBoundsException("Invalid entry index");
    }
}
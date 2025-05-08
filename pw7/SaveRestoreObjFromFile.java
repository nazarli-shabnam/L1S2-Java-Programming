package pw7;

//exercise 2
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveRestoreObjFromFile {

    public static void saveToFile(String outputFile, Object object) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            oos.writeObject(object);
        }
    }

    public static Object restoreFromFile(String inputFile) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile))) {
            return ois.readObject();
        }
    }

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("pw7/iris.csv");
        try {
            csvReader.importData();
            System.out.println("Imported " + csvReader.getNumberOfEntries() + " data entries from CSV");

            String serializedFile = "csvdata.ser";
            saveToFile(serializedFile, csvReader);
            System.out.println("CSVReader object serialized to " + serializedFile);

            CSVReader restoredReader = (CSVReader) restoreFromFile(serializedFile);
            System.out.println("Deserialized object. First data entry: " + restoredReader.getEntry(0));
            System.out.println("CSV headers: " + restoredReader.getHeaders());

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

class CSVReader implements Serializable {
    private static final long serialVersionUID = 1L;
    private String fileName;
    private ArrayList<String> headers;
    private ArrayList<ArrayList<String>> entries;

    public CSVReader(String fileName) {
        this.fileName = fileName;
        this.headers = new ArrayList<>();
        this.entries = new ArrayList<>();
    }

    public void importData() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                headers = new ArrayList<>(Arrays.asList(line.split(",")));
            }

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                ArrayList<String> entry = new ArrayList<>();
                for (String value : values) {
                    entry.add(value.trim());
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

    public ArrayList<String> getHeaders() {
        return headers;
    }
}
package pw7;

//exercise 1
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("pw7/iris.csv");
        try {
            csvReader.importData();
            System.out.println("Number of entries: " + csvReader.getNumberOfEntries());

            System.out.println("First entry: " + csvReader.getEntry(0));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
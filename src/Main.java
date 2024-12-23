/**
 * Main class to demonstrate loading a relational table using the Loader.
 */
import lab8.*;
import lab8.Record;
public class Main {
    public static void main(String[] args) {
        Loader loader = new FileLoader("datafile.csv");
        RelationalTable table = loader.loadTable();
        System.out.println("Table Name: " + table.getTableName());
        for (Record record : table.getRecords()) {
            System.out.println("Record ID: " + record.getId() +
                    ", Name: " + record.getName() +
                    ", Email: " + record.getEmail());
        }
    }
}

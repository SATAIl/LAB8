/**
 * Concrete implementation of Loader that loads a relational table from a file.
 */
package lab8;
public class FileLoader extends Loader {
    private final String filePath;

    /**
     * Constructs a FileLoader with the specified file path.
     *
     * @param filePath the path to the external file
     */
    public FileLoader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    protected String getSource() {
        System.out.println("getSource called with filePath: " + filePath);
        // Stub implementation
        return filePath;
    }

    @Override
    protected String readData(String source) {
        System.out.println("readData called with source: " + source);
        // Stub implementation
        return "id,name,email\n1,John Doe,john@example.com";
    }

    @Override
    protected RelationalTable parseData(String data) {
        System.out.println("parseData called with data: " + data);
        // Stub implementation
        String[] lines = data.split("\n");
        String tableName = "LoadedTable";
        RelationalTable.Builder tableBuilder = new RelationalTable.Builder().setTableName(tableName);
        for (int i = 1; i < lines.length; i++) {
            String[] fields = lines[i].split(",");
            Record record = new Record.Builder()
                    .setId(Integer.parseInt(fields[0]))
                    .setName(fields[1])
                    .setEmail(fields[2])
                    .build();
            tableBuilder.addRecord(record);
        }
        return tableBuilder.build();
    }
}

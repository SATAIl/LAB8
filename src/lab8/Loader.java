/**
 * Abstract class that defines the template for loading a relational table from an external file.
 */
package lab8;
public abstract class Loader {
    /**
     * Loads a relational table from an external source.
     *
     * @return the loaded RelationalTable
     */
    public final RelationalTable loadTable() {
        System.out.println("loadTable started.");
        String source = getSource();
        System.out.println("Source obtained: " + source);
        String data = readData(source);
        System.out.println("Data read: " + data);
        RelationalTable table = parseData(data);
        System.out.println("Data parsed into table: " + table.getTableName());
        return table;
    }

    /**
     * Gets the source from which to load the table.
     *
     * @return the source as a String
     */
    protected abstract String getSource();

    /**
     * Reads data from the given source.
     *
     * @param source the source to read from
     * @return the data as a String
     */
    protected abstract String readData(String source);

    /**
     * Parses the raw data into a RelationalTable.
     *
     * @param data the raw data
     * @return the parsed RelationalTable
     */
    protected abstract RelationalTable parseData(String data);
}

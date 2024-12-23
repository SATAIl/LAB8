package lab8;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a relational table consisting of multiple records.
 */
public class RelationalTable {
    private final String tableName;
    private final List<Record> records;

    private RelationalTable(Builder builder) {
        this.tableName = builder.tableName;
        this.records = builder.records;
    }

    /**
     * Gets the name of the table.
     *
     * @return the table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Gets the list of records in the table.
     *
     * @return the list of records
     */
    public List<Record> getRecords() {
        return records;
    }

    /**
     * Adds a record to the table.
     *
     * @param record the record to add
     */
    public void addRecord(Record record) {
        System.out.println("addRecord called with record ID: " + record.getId());
        // Business logic stub
    }

    /**
     * Builder for creating instances of RelationalTable.
     */
    public static class Builder {
        private String tableName;
        private List<Record> records = new ArrayList<>();

        /**
         * Sets the name of the table.
         *
         * @param tableName the table name
         * @return the Builder instance
         */
        public Builder setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Adds a record to the table.
         *
         * @param record the record to add
         * @return the Builder instance
         */
        public Builder addRecord(Record record) {
            this.records.add(record);
            return this;
        }

        /**
         * Builds and returns a RelationalTable instance.
         *
         * @return a new RelationalTable instance
         */
        public RelationalTable build() {
            return new RelationalTable(this);
        }
    }
}

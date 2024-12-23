package lab8;
/**
 * Represents a single record in a relational table.
 */
public class Record {
    private final int id;
    private final String name;
    private final String email;

    private Record(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
    }

    /**
     * Gets the ID of the record.
     *
     * @return the record ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name associated with the record.
     *
     * @return the record name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the email associated with the record.
     *
     * @return the record email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Builder for creating instances of Record.
     */
    public static class Builder {
        private int id;
        private String name;
        private String email;

        /**
         * Sets the ID for the record.
         *
         * @param id the record ID
         * @return the Builder instance
         */
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        /**
         * Sets the name for the record.
         *
         * @param name the record name
         * @return the Builder instance
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the email for the record.
         *
         * @param email the record email
         * @return the Builder instance
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Builds and returns a Record instance.
         *
         * @return a new Record instance
         */
        public Record build() {
            return new Record(this);
        }
    }
}

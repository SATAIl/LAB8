/**
 * Клас DataRecord представляє один запис у реляційній таблиці.
 * Зберігає набір полів у вигляді рядкових значень.
 */
public class DataRecord {

    /**
     * У цьому прикладі припустимо, що ми маємо масив рядків,
     * який зберігає дані одного запису.
     */
    private String[] fields;

    /**
     * Створює новий запис, ініціалізуючи внутрішній масив полів.
     *
     * @param fields Масив полів (рядків)
     */
    public DataRecord(String[] fields) {
        this.fields = fields;
    }

    /**
     * Повертає масив рядків, що зберігаються у цьому записі.
     *
     * @return масив рядків
     */
    public String[] getFields() {
        return fields;
    }

    /**
     * Встановлює новий масив рядків для цього запису.
     *
     * @param fields новий масив рядків
     */
    public void setFields(String[] fields) {
        this.fields = fields;
        System.out.println("Метод setFields: Нові значення полів встановлено.");
    }

    /**
     * Виводить у консоль вміст запису
     */
    public void displayRecord() {
        System.out.println("Вивід запису (заглушка):");
        for (String f : fields) {
            System.out.print(f + " ");
        }
        System.out.println();
    }
}

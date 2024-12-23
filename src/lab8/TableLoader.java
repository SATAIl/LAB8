/**
 * Клас TableLoader реалізує завантажувач таблиці з зовнішнього файлу.
 * Використовує шаблон Singleton для забезпечення єдиного екземпляра.
 */
public class TableLoader {

    /**
     * Статичне посилання на єдиний екземпляр класу TableLoader.
     */
    private static TableLoader instance;

    /**
     * Приватний конструктор, щоб уникнути створення екземплярів ззовні.
     */
    private TableLoader() {
        // Приватний, щоб не можна було створити об'єкт напряму
    }

    /**
     * Статичний метод доступу до єдиного екземпляра TableLoader.
     *
     * @return єдиний екземпляр TableLoader
     */
    public static TableLoader getInstance() {
        if (instance == null) {
            instance = new TableLoader();
        }
        return instance;
    }

    /**
     * Завантажує реляційну таблицю з зовнішнього файлу.
     * (Заглушка бізнес-логіки, яка просто виводить повідомлення)
     *
     * @param filePath шлях до файлу
     * @return новостворений об'єкт RelationalTable
     */
    public RelationalTable loadTable(String filePath) {
        System.out.println("Метод loadTable: Імітуємо завантаження з файлу: " + filePath);

        RelationalTable table = new RelationalTable();

        String[] row1 = {"ID1", "Name1", "Value1"};
        String[] row2 = {"ID2", "Name2", "Value2"};

        table.addRecord(new DataRecord(row1));
        table.addRecord(new DataRecord(row2));

        System.out.println("Таблиця завантажена (заглушка).");
        return table;
    }
}

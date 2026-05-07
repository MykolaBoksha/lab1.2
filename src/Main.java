public class Main {
    public static void main(String[] args) {
        //таблиця роміром 10
        HashTable hashTable = new HashTable(10);

        //1 рівень уставка елементів без колізій (підбираємо різні периметри)
        System.out.println("--- Завдання 1 рівня (без колізій) ---");
        hashTable.insert(new Rectangle(0, 0, 1, 1)); // P=4, index=4
        hashTable.insert(new Rectangle(0, 0, 2, 2)); // P=8, index=8
        hashTable.display();

        //2 рівень уставка з колізіями
        System.out.println("\n--- Завдання 2 рівня (з колізіями) ---");
        //створюємо прямокутник з таким самим периметром (P=4) щоб виникла колізія
        hashTable.insert(new Rectangle(0, 0, 0.5, 1.5)); // P=4, index 4 зайнятий -> піде в 5
        hashTable.insert(new Rectangle(0, 0, 3, 3));     // P=12, index=2

        hashTable.display();
    }
}

class HashTable {
    private Rectangle[] table;
    private int size;

    public HashTable(int capacity) {
        this.size = capacity;
        this.table = new Rectangle[capacity];
    }

    // Метод хешування: Ділення (h(k) = k mod m)
    private int hashFunction(double key) {
        // Використовуємо цілу частину периметра як ключ для хешування
        return (int) Math.floor(key) % size;
    }

    // Вставка з вирішенням колізій (Лінійне зондування)
    public void insert(Rectangle rect) {
        double key = rect.getPerimeter();
        int index = hashFunction(key);
        int startIndex = index;

        // Пошук вільного місця (відкрита адресація)
        while (table[index] != null) {
            index = (index + 1) % size; // Лінійний крок
            if (index == startIndex) {
                System.out.println("Таблиця переповнена!");
                return;
            }
        }
        table[index] = rect;
    }

    public void display() {
        System.out.println("\nЗміст хеш-таблиці:");
        for (int i = 0; i < size; i++) {
            if (table[i] != null) {
                System.out.println("[" + i + "]: " + table[i]);
            } else {
                System.out.println("[" + i + "]: порожньо");
            }
        }
    }
}

package HashMapandHashFunction;

import java.util.LinkedList;

class HashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 10; // Default size
    private LinkedList<Entry<K, V>>[] table;

    @SuppressWarnings("unchecked")
    public HashMap() {
        table = new LinkedList[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }

        table[index].add(new Entry<>(key, value)); // Insert new key-value pair
    }

    public V get(K key) {
        int index = hash(key);

        if (table[index] == null) return null;

        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    public void remove(K key) {
        int index = hash(key);

        if (table[index] == null) return;

        table[index].removeIf(entry -> entry.key.equals(key)); // Remove key if found
    }

    public void printHashMap() {
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null) {
                System.out.print("Bucket " + i + ": ");
                for (Entry<K, V> entry : table[i]) {
                    System.out.print("[" + entry.key + " -> " + entry.value + "] ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 26); // Update existing key

        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Bob"));

        map.remove("Bob");
        System.out.println("Bob's age after removal: " + map.get("Bob"));

        map.printHashMap();
    }
}

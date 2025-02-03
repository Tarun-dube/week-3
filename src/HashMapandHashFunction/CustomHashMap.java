package HashMapandHashFunction;

import java.util.LinkedList;

class MyHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<Node<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % DEFAULT_CAPACITY;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value; // Update existing key
                return;
            }
        }

        buckets[index].add(new Node<>(key, value)); // Insert new key-value pair
    }

    public V get(K key) {
        int index = hash(key);

        if (buckets[index] == null) return null;

        for (Node<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null; // Key not found
    }

    public void remove(K key) {
        int index = hash(key);

        if (buckets[index] == null) return;

        buckets[index].removeIf(node -> node.key.equals(key)); // Remove key if found
    }

    public void printHashMap() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            if (buckets[i] != null) {
                System.out.print("Bucket " + i + ": ");
                for (Node<K, V> node : buckets[i]) {
                    System.out.print("[" + node.key + " -> " + node.value + "] ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();

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

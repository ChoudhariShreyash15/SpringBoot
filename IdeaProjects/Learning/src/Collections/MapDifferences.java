package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapDifferences {
    public static void main(String[] args) {
        // Data to insert (insertion order: 3, 1, 2)
        // Expected sorted order: 1, 2, 3

        System.out.println("--- HashMap Example (No Order) ---");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Mango");
        hashMap.put(2, "Banana");
        // Output order is unpredictable/arbitrary
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n--- LinkedHashMap Example (Insertion Order) ---");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Mango");
        linkedHashMap.put(2, "Banana");
        // Output order matches the insertion order (3, 1, 2)
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n--- TreeMap Example (Sorted Order by Key) ---");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Mango");
        treeMap.put(2, "Banana");
        // Output order is sorted by the integer keys (1, 2, 3)
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

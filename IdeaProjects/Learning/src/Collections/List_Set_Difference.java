package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Set_Difference {
    public static void main(String[] args) {
        // --- List Example (Ordered, allows duplicates) ---
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate
        list.add("Orange");

        System.out.println("List elements (insertion order maintained):");
        for (String element : list) {
            System.out.println(element);
        }
        // Output will be: Apple, Banana, Apple, Orange

        // --- Set Example (Unordered, no duplicates) ---
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate is ignored
        set.add("Orange");

        System.out.println("\nSet elements (order is arbitrary, no duplicates):");
        for (String element : set) {
            System.out.println(element);
        }
        // Output order may vary (e.g., Orange, Apple, Banana), but "Apple" appears only once.
    }
}


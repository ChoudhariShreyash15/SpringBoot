package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetDifferences {
    public static void main(String[] args) {
        // HashSet: No order guaranteed (output order is unpredictable)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate ignored
        System.out.println("HashSet: " + hashSet); // Output might be [Banana, Apple, Mango] or a different order

        // LinkedHashSet: Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple"); // Duplicate ignored
        System.out.println("LinkedHashSet: " + linkedHashSet); // Output is [Banana, Apple, Mango] (insertion order)

        // TreeSet: Maintains elements in sorted (natural) order
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Apple"); // Duplicate ignored
        System.out.println("TreeSet: " + treeSet); // Output is [Apple, Banana, Mango] (alphabetical order)
    }
}

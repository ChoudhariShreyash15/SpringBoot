package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList_Difference {
    public static void main(String[] args) {
        // --- ArrayList Example ---
        // Best for accessing elements quickly by index
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Access element at index 1: " + arrayList.get(1)); // Fast O(1) access

        // Inserting in the middle is slow for ArrayList (O(n))
        arrayList.add(1, "Grape");
        System.out.println("ArrayList after adding Grape at index 1: " + arrayList);

        // --- LinkedList Example ---
        // Best for adding/removing elements quickly from ends or middle (with iterator)
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");
        System.out.println("LinkedList: " + linkedList);

        // Deleting from the middle is fast for LinkedList (conceptually O(1) once location is found)
        // Note: Finding the element by value is still O(n) traversal.
        linkedList.remove("Cat");
        System.out.println("LinkedList after removing Cat: " + linkedList);

        // Adding to the beginning is fast for LinkedList (O(1))
        ((LinkedList<String>) linkedList).addFirst("Zebra");
        System.out.println("LinkedList after adding Zebra to the start: " + linkedList);
    }
}

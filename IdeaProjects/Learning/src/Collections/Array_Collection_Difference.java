package Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_Collection_Difference {
    public static void main(String[] args) {

//Array Example

        // Declaration and initialization of an integer array with a fixed size of 3
        int[] numbers = new int[3];

        // Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Accessing elements
        System.out.println("Element at index 1: " + numbers[1]);

        // Getting the size (using the length property)
        System.out.println("Array length: " + numbers.length);

//Collection Example (ArrayList)

        // Declaration and initialization of an ArrayList (dynamic size)
        List<String> names = new ArrayList<>();

        // Adding elements (uses built-in add() method, resizes automatically)
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements (uses built-in get() method)
        System.out.println("Element at index 1: " + names.get(1));

        // Getting the size (using the size() method)
        System.out.println("Collection size: " + names.size());

        // Removing elements (uses built-in remove() method)
        names.remove("Bob");
        System.out.println("Collection size after removal: " + names.size());

    }
}

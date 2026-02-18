package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_Map_Difference {
    public static void main(String[] args) {
//        Collection Example (using ArrayList)

        List<String> names = new ArrayList<>(); // A List is a type of Collection
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Lists allow duplicate elements

        System.out.println("Names list: " + names);
        System.out.println("Element at index 0: " + names.get(0)); // Access by index

//        Map Example (using HashMap)
        Map<Integer, String> studentMap = new HashMap<>(); // Stores key-value pairs
                studentMap.put(101, "David"); // Use put() to add elements
                studentMap.put(102, "Charlie");
                studentMap.put(101, "Eve"); // This will update the value for key 101, not add a duplicate

                System.out.println("Student Map: " + studentMap);
                System.out.println("Student with roll no 102: " + studentMap.get(102)); // Access by unique key
                System.out.println("Student with roll no 101 after update: " + studentMap.get(101));
            }
        }

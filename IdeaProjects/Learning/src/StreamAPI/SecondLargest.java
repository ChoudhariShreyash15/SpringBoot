package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 30, 15, 30);

        Integer secondLargest = numbers.stream()
                .distinct()                               // remove duplicates
                .sorted(Comparator.reverseOrder())        // sort in descending order
                .skip(1)                                  // skip the first (largest)
                .findFirst()                              // get the second
                .orElse(null);                            // handle empty case

        System.out.println("Second Largest: " + secondLargest);
    }
}

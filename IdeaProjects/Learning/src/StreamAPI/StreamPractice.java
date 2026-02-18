package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 20, 50);

//        Find Even No from List
//        nums.stream().filter(n-> n%2==0).sorted().forEach(System.out::println);
//        System.out.println(nums.stream().filter(x -> x%2==0).sorted().collect(Collectors.toList()));

//        Find Odd No from List
//        System.out.println(nums.stream().filter(n->n%2==1).sorted().collect(Collectors.toList()));

//        check whether the no is greater than 10 or not result should be in boolean.
        long l = nums.stream().filter(i -> i > 10).count();
        if (l == nums.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(l);

        boolean b = nums.stream().allMatch(i -> i > 10);
        System.out.println(b);
    }
}

package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamBasics {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,5,2,8,1,7);

        Calculator  c = ( a, b)-> a*b;
        c.calculate(10,20);


//        nums.forEach(System.out::println);
//                        ||
//                        ||
//                        \/
//        Stream<Integer> stream = nums.stream();
//        stream.forEach(System.out::println);
//                        ||
//                        ||
//                        \/
//        Stream<Integer> stream1 = nums.stream();
//        long count = stream1.count();
//        System.out.println(count);
////        data.forEach(n -> System.out.println(nums));
//                        ||
//                        ||
//                        \/
//        Stream<Integer> stream2 = nums.stream();
//        Stream<Integer> sorted = stream2.sorted();
//        sorted.forEach(System.out::println);
//                        ||
//                        ||
//                        \/
        //Traditional method
//        for(int n : nums){
//            System.out.println(n*2);
//        }
//        Stream<Integer> stream3 = nums.stream();
//        Stream<Integer> mapped = stream3.map(n -> n * 2);
//        mapped.forEach(System.out::println);
//                        ||
//                        ||
//                        \/
//        nums.stream().map(n->n*2).forEach(System.out::println);
//                        ||
//                        ||
//                        \/
//        nums.stream().filter().sorted().map(n->n*2).forEach(System.out::println);

//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                if(n%2==1)
//                    return true;
//                else
//                    return false;
//            }
//        };
//                        ||
//                        ||
//                        \/
//        Predicate<Integer> predicate1 = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer n) {
//                return n%2==1;
//            }
//        };
//                        ||
//                        ||
//                        \/
//        Predicate<Integer> predicate2 = (Integer n) -> n%2==1;
//        Predicate<Integer> predicate3 = n -> n%2==1;
//                        ||
//                        || Reduced to
//                        \/
//        nums.stream().filter(n -> n%2==1).sorted().map(n -> n*2).forEach(System.out::println);


//        Function<Integer, Object> function = new Function<Integer, Object>() {
//            @Override
//            public Object apply(Integer n) {
//                return n*2;
//            }
//        };
//                        ||
//                        || Reduced to
//                        \/
//        Function<Integer, Object> function1 = (Integer n) -> n*2;
//        Function<Integer, Object> function2 = n -> n*2;
//                        ||
//                        || Reduced to
//                        \/
        nums.stream().filter( n -> n%2==1).sorted().map(n->n*2).forEach(System.out::println);

    }
}

@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

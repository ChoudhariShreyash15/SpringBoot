package StreamAPI;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNo {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,5,6);
        int a = 17;
        Set<Integer> collect = Stream.of(a).filter(i -> i > 1).filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(i -> n % i != 0)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}

package org.example.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,5,8,9);
        List<Integer> l1 = l.stream().map((i)-> (i + 5)).collect(Collectors.toList());
        System.out.println(l1);
    }
}

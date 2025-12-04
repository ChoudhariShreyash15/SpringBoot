package org.example.MethodReferencing;

import java.util.Arrays;
import java.util.List;

interface A{
    public void add(int a, int b);
}

public class B {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        A a = B::sum;
        a.add(12,13);

        //Using List
        List<Integer> l = List.of(1,2,3,4,5);
        l.forEach(System.out::println);

        //Using Arrays
        List<Integer> n = Arrays.asList(1,2,3,4);
        n.forEach(System.out::println);
    }
}

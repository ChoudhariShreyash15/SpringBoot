package org.example.Functional_Interface;

//Functional Interface - should contain only 1 abstract method and default,static methods are allowed.
interface A {
    abstract void m1(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void m1(int a, int b) {
                System.out.println(a + b);
            }
        };
        a.m1(2,3);
    }
}

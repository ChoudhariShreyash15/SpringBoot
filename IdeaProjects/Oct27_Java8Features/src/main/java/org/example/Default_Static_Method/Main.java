package org.example.Default_Static_Method;

interface A {
    public static void check() {
        System.out.println("Static Method");
    }

    public default void check1() {
        System.out.println("Default Method");
    }
}

public class Main implements A {
    public static void main(String[] args) {
        Main m = new Main();
        A.check();
        m.check1();
    }
}

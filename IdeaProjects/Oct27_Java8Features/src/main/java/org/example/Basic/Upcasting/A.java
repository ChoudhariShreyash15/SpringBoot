package org.example.Basic.Upcasting;

public class A {
}

class B extends A{
}

class Main {
    public static void main(String[] args) {
        A a = new B(); //Upcasting

        B b1 = new B();
        A a1 = b1;
    }
}

package org.example.Basic.Downcasting;

interface A {
}

class B implements A {
}

class Main {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
    }
}
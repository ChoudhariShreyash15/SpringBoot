package org.example.LambdaFunction;

interface B {
    public void m1(int a, int b);
}

public class A {
    public static void main(String[] args) {
        B b1 = (int a, int b)->{
            System.out.println(a * b);
        };
        b1.m1(2,3);
    }
}

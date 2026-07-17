package org.example.Basic.StringPool;

public class StringPool {
    public static void main(String[] args) {
        // Stores in String Pool
        String s1 = "Java";
        String s2 = "Java";
        // checks address
        System.out.println(s1==s2); //stores on same memory location
        System.out.println(s1.equals(s2));
        System.out.println(s2.hashCode());

        // Stores in Heap Memory
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s3==s4); //stores on different memory location
        System.out.println(s3.equals(s4)); // checks value

        String s5 = new String("Java");
        String s6 = "Java";
        System.out.println(s5==s6); //stores on different memory location
        System.out.println(s5.equals(s6)); // checks value
    }
}
package org.example.Basic.TypeCasting;

//Widening or Implicit Typecasting
public class Implicit {

    public static void main(String[] args) {
        //byte->short->char->int->long->float->double
        byte a = 127;
        short b = a;
        char c = (char) b;
        int d = c;
        long e = d;
        float f = e;
        double g = f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}

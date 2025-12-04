package org.example.Basic.TypeCasting;

//Narrowing or Explicit Typecasting
public class Explicit {

    public static void main(String[] args) {
        //double->float->long->int->char->short->byte
        double a = 11.11;
        float  b = (float) a;
        long   c = (long) b;
        int    d = (int) c;
        char   e = (char) d;
        short  f = (short) e;
        byte   g = (byte) f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

}

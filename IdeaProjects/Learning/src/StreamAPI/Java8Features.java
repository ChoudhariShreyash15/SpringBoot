package StreamAPI;

import java.util.List;

public class Java8Features {
    public static void main(String[] args) {
        List<Integer> n = List.of(1,2,3,4,5,6);
        n.forEach(System.out::println); //Method Referencing
    }
}

class Prac implements DefaultAndStaticMethods {

    @Override
    public void check2() {}

    @Override
    public void check1(){}

    public void check(){} // No Overriding for static method. Why? idk
}

// Default and Static Method
interface DefaultAndStaticMethods {
    public static void check(){}   //Static Method(Introduced in Java 8 Features to reduce loc)

    public default void check1(){} //Default Method(Introduced in Java 8 Features to reduce loc)

    public abstract void check2(); //Abstract Method(present before Java 8 Features exist i.e. static and default)
}

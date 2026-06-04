package OOPsConcept.Inheritance;

interface Parent1 {
    static void fun() { System.out.println("Parent1 fun"); }
}

interface Parent2 {
    default void fun() { System.out.println("Parent2 fun"); }
}

class Child implements Parent1, Parent2 {
    @Override
    public void fun() {
        Parent1.fun(); // Explicitly choose which default method to call
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        Child c = new Child();
        c.fun(); // Output: Parent1 fun
    }
}
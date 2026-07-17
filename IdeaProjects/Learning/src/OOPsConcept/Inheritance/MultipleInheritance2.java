package OOPsConcept.Inheritance;

class A{
    int a;

    void A1(){
        System.out.println("A1");
    }
}

class B extends A{
    int b;
    B(int b){
    }

    void B1(){
        System.out.println("B1");
    }
}

public class MultipleInheritance2 {
    public static void main(String[] args) {
        B b = new B(10);
        b.A1();
    }
}

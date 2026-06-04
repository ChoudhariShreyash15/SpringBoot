package OOPsConcept.Inheritance;

//Super class
class Vehicle1 {
    Vehicle1() {
        System.out.println("This is a Vehicle");
    }
}

// Subclass 
class Car1 extends Vehicle1 {
    Car1() {
        System.out.println("This Vehicle is Car");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating object of subclass invokes base class constructor
        Car1 obj = new Car1();
    }
}
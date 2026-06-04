package OOPsConcept.Inheritance;

class Vehicle2 {
    Vehicle2() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle2 {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car2 extends FourWheeler {
    Car2() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Car2 obj = new Car2(); // Triggers all constructors in order
    }
}
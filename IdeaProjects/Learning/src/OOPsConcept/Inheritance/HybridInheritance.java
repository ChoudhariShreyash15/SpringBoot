package OOPsConcept.Inheritance;

// Superclass
class Vehicle4 {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

// Interface for fare
interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}

// Subclass 1: Single inheritance + multilevel
class Car4 extends Vehicle4 {
    void carType() {
        System.out.println("This is a Car");
    }
}

// Subclass 2: Hybrid inheritance (extends class + implements interface)
class Bus4 extends Vehicle4 implements Fare {
    void busType() {
        System.out.println("This is a Bus");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Car4 car = new Car4();
        car.vehicleType(); // inherited from Vehicle
        car.carType();     // specific to Car

        Bus4 bus = new Bus4();
        bus.vehicleType(); // inherited from Vehicle
        bus.busType();     // specific to Bus
        bus.fareInfo();    // from Fare interface
    }
}
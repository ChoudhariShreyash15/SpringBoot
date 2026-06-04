package OOPsConcept.Inheritance;

class Vehicle3 {
    Vehicle3() {
        System.out.println("This is a Vehicle");
    }
}

class Car3 extends Vehicle3 {
    Car3() {
        System.out.println("This Vehicle is Car");
    }
}

class Bus extends Vehicle3 {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car3 obj1 = new Car3();
        Bus obj2 = new Bus();
    }
}
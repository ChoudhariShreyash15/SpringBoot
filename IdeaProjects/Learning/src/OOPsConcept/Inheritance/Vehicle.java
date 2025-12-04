package OOPsConcept.Inheritance;

public class Vehicle {
    void start() {
        System.out.println("Vehicle starts...");
    }

    void stop() {
        System.out.println("Vehicle stops...");
    }
}

class Car extends Vehicle{
    void drive() {
        System.out.println("Car running...");
    }
}

class Bike extends Vehicle{
    void ride() {
        System.out.println("Bike running...");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        Bike bike = new Bike();
        bike.start();
        bike.ride();
        bike.stop();
    }
}
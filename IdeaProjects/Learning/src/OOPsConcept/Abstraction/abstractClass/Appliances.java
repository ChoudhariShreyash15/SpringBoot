package OOPsConcept.Abstraction.abstractClass;

abstract class Appliances {
    abstract void turnOn();

    void turnOff() {
        System.out.println("Appliance turned off.");
    }
}

class Fan extends Appliances{
    void turnOn() {
        System.out.println("Fan is spinning");
    }
}

class Light extends Appliances {
    void turnOn() {
        System.out.println("Light is glowing");
    }
}

class Main {
    public static void main(String[] args) {
        Appliances fan = new Fan();
        Appliances light = new Light();

        fan.turnOn();
        fan.turnOff();

        light.turnOn();
        light.turnOff();
    }
}
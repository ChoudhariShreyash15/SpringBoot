package com.example.Sept2_DesignPatterns.creational;

interface Animal1 {
    void sound();
}

class Dog implements Animal1 {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal1 {
    public void sound() {
        System.out.println("Cat meows");
    }
}

class AnimalFactory {

    public static Animal1 getAnimal(String type) {

        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }

        return null;
    }
}

public class Factory {
    public static void main(String[] args) {

        Animal1 animal1 = AnimalFactory.getAnimal("dog");
        animal1.sound();

        Animal1 animal2 = AnimalFactory.getAnimal("cat");
        animal2.sound();
    }
}


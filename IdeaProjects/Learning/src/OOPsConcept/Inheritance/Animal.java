package OOPsConcept.Inheritance;

public class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("Cat is Meowing...");
    }
}

class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

        Cat cat = new Cat();
        cat.meow();
    }
}
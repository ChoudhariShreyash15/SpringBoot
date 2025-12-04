package OOPsConcept.Abstraction;

/* NOTE: for class it is compulsory to override all the methods written
         in interface but in case of abstract class
         you can override the methods according to your need*/

interface Abstraction {
    public void walk();

    public void talk();

    public void sleep();

    public void eat();
}

/* NOTE : More than one abstract method can be present in one abstract class but
          in Functional Interface only one abstract method is allowed to write in one abstract class*/
abstract class Implementation implements Abstraction {
    @Override
    public void walk() {
        System.out.println("Person Walking");
    }

    abstract void run();

    abstract void w();
}

class Impl implements Abstraction {
    @Override
    public void walk() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}
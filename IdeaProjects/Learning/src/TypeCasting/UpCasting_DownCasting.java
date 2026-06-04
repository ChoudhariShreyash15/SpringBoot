package TypeCasting;

public class UpCasting_DownCasting {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.AnimalSound(); //UpCasting - Overridden method of Child or Derived class will be called always
        Animal.AnimalSound(); // To call the parent class method

        Cat c = (Cat) a;
        Cat c1 = new Cat();
        c.AnimalSound(); //DownCasting
        c.eat();
        c1.eat();
    }

    public static class Animal {
        public static void AnimalSound(){
            System.out.println("AnimalSounds");
        }
    }

    public static class Cat extends Animal {
        public static void AnimalSound(){
//            super.AnimalSound(); // To call the parent class method
            System.out.println("Meow");
        }
        public void eat() {
            System.out.println("Cat eats fish");
        }
    }
}
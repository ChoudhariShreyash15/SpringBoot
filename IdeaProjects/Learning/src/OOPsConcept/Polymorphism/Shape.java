package OOPsConcept.Polymorphism;

public class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square...");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle...");
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
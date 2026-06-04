package Constructor;

public class Rectangle {
    int length;
    int breadth;

//    Rectangle(int length, int breadth){
//        this.length = length;
//        this.breadth = breadth;
//    }
//
    Rectangle () {
        length = 2;
        breadth = 3;
    }

    int area(){
        return length*breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(10,5);
//        System.out.println("Area of Rectangle is: " + rectangle.area());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
    }
}

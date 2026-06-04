package OOPsConcept.JavaOopsAssignment;

public class Q4 {
    int length;
    int breadth;

    Q4(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    Q4() {}

    int area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Q4 rectangle = new Q4(10,5);
        System.out.println("Area of Rectangle is: " + rectangle.area());

        Q4 rectangle2 = new Q4();
        System.out.println("Area of Rectangle2 is: " + rectangle2.area());
    }
}

package String.Basics;

public class StringComparison {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b); //== -> compare address

        System.out.println(a.equals(b)); // .equals -> compare value
    }
}

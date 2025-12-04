package String.Basics;

public class Basic {
    public static void main(String[] args) {
        String name = "Hello";
        String s1 = "Hello";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(4));
        System.out.println(name.equals(s1));
        System.out.println(name.equalsIgnoreCase(s1));
        System.out.println(name.contains("ell"));
        System.out.println(name.indexOf('e'));
        System.out.println(name.replace('o','!'));
    }
}

package String.Basics;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Shreyash";
        String s2 = "Choudhari";
        String fullName = s1 + " " + s2;
        System.out.println(fullName);

        //shortcut
        System.out.println(s1.concat(" ").concat(s2));
    }
}
package String.CodingQuestions;

public class PalindromeUsingInbuiltMethods {
    public static void main(String[] args) {
        String s = "Madam";
        s=s.toLowerCase();
        String reversed = "";

        for (int i=s.length()-1; i>=0; i--) {
            reversed += s.charAt(i);
        }

        if (s.equals(reversed)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}

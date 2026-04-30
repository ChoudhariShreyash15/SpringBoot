package String.CodingQuestions;

public class P {
    public static void main(String[] args) {
        String n = "abba";
        int a = 0;
        int b = n.length() - 1;
        boolean isPalindrome = true;

        while (a < b){
            if (n.charAt(a) != n.charAt(b)) {
                isPalindrome = false;
                break;
            }
            a++;
            b--;
        }

        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}

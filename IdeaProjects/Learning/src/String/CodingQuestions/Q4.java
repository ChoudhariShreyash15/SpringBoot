package String.CodingQuestions;

public class Q4 {
    public static void main(String[] args) {
        String s = "abbbkba";
        int x = 0;
        int y = s.length() - 1;
        boolean isPalindrome = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(x) == s.charAt(y)) {
                x++;
                y--;
                isPalindrome=true;
            }
            else if (s.charAt(x) != s.charAt(y)) {
                if (s.charAt(x) == s.charAt(y - 1)) {
                    x++;
                    y -= 2;
                    isPalindrome=true;
                } else {
                    x += 2;
                    y--;
                    isPalindrome=true;
                }
            }
            else {
                isPalindrome=false;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}

package String.CodingQuestions;

public class Q3 {
    public static void main(String[] args) {
        String s = "EIDIKO";
        int len = s.length()/2;

        for (int i=len-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }

        for (int j=s.length()-1; j>=len; j--) {
            System.out.print(s.charAt(j));
        }
    }
}

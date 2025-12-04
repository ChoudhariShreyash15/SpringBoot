package String.CodingQuestions;

import java.util.Scanner;

public class Q1 {
    //Take a string input and count how many uppercase letters are there.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = scanner.next();
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.println(s.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
}

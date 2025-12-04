package String.CodingQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = scanner.next();
        int x=0;
        int y=a.length()-1;
        boolean isPalindrome = true;

        while(x<y){
            if(a.charAt(x)!=a.charAt(y)){
                isPalindrome= false;
                break;
            }
            x++;
            y--;
        }

        if (isPalindrome){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}

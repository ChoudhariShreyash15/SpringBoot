package String.CodingQuestions;

public class CountVowel {
    public static void main(String[] args) {
        String s = "Pratik";
        int count = 0;
        s=s.toLowerCase();

        for (int i=0; i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }
        System.out.println("Number of Vowels present in string: " + count);
    }
}

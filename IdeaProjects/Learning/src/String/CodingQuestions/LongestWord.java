package String.CodingQuestions;

public class LongestWord {
    //Take a string and find the longest word in it.
    public static void main(String[] args) {
        String s = "My Name is Shreyash";
        String[] s1 = s.split(" ");
        int count=0;
        String maxWord="";

        for (int i=0; i<s1.length; i++) {
            if (s1[i].length()>count) {
                count=s1[i].length();
                maxWord=s1[i];
            }
        }
        System.out.println("Length of Longest Word: " + count);
        System.out.println("Longest Word: " + maxWord);
    }
}

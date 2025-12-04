package String.CodingQuestions;

public class WordsCount {
    public static void main(String[] args) {
        String s = "             I am Shreyash  Vijay  Choudhari                   ";
        String trim = s.trim();
//        System.out.println(trim);
        int count = 1;
        if (s.isEmpty() || s.isBlank()) {
            System.out.println("No Word Found");
        } else {
            for (int i = 0; i < trim.length(); i++) {
                if (trim.charAt(i) == ' ' && trim.charAt(i+1) != ' ') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

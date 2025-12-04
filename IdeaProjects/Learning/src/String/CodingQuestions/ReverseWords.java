package String.CodingQuestions;

public class ReverseWords {
    //Convert "hello world" → "World Hello" (reverse words).
    public static void main(String[] args) {
        String s = " hello world  ";
        String[] s1 = s.trim().split(" ");

        for (int i=s1.length-1; i>=0; i--) {
            System.out.print(s1[i] + " ");
        }
    }
}

//class Main {
//    public static void main(String[] args) {
//        String str = " hello world     is    best  ";
//
//        String word = "";
//        String result = "";
//
//        // loop through each character
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != ' ') {
//                word = word + str.charAt(i); // build the word
//            } else {
//                result = word + " " + result; // put word at beginning
//                word = ""; // reset
//            }
//        }
//
//        // for last word (because no space after it)
//        result = word + " " + result;
//
//        System.out.println(result.trim());
//    }
//}

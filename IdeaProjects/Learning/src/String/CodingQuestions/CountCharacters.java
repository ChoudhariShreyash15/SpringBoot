package String.CodingQuestions;

import java.util.HashMap;

public class CountCharacters {
    public static HashMap<Character,Integer> Optimization(String str) {
                HashMap<Character, Integer> map = new HashMap<>();

                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }

                return map;
    }

    public static void main(String[] args) {
        String str = "apple";

        int[] freq = new int[256]; // for all ASCII characters

        // Count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;// increment count for this character
        }

        // Print result
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " = " + freq[i]);
            }
        }
        System.out.println(Optimization("apple"));
    }
}
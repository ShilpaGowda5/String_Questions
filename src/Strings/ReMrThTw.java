package Strings;

import java.util.HashMap;

public class ReMrThTw {
    public static void main(String[] args) {
        String input = "aabcaaabb";
        HashMap<Character, Integer> charCount = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int count = charCount.getOrDefault(c, 0);
            if (count < 2) {
                result.append(c);
                charCount.put(c, count + 1);
            }
        }
        System.out.println(result.toString());
    }
}

//    The code removes characters from the input string if they occur more than twice,
//        resulting in a string where no character appears more than twice.

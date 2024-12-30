package Strings;
import java.util.HashSet;

public class LongestStringWithoutRep {
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0; // Sliding window start
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            // Remove characters from the set until no duplicates remain
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of the longest substring without repetition: "
                + lengthOfLongestSubstring(input));
    }
}


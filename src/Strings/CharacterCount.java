package Strings;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "banana";
        Map<Character, Integer> charCountMap = countCharacterFrequency(str);
        System.out.println(charCountMap);
    }

    public static Map<Character, Integer> countCharacterFrequency(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }
}

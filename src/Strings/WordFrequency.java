package Strings;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) {

        String[] arr = {"ckm", "blr","mum", "del", "blr", "ckm"};

        String str = "Apple is a Apple";

        Map<String, Integer> freqMap = new HashMap<>();

        for(String s : arr) {

            freqMap.put(s, freqMap.getOrDefault(s, 0)+1);

        }
        System.out.println(freqMap);

    }

}

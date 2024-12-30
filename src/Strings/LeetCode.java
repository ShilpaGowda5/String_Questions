package Strings;
import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(romanToInt("I"));
        System.out.println(romanToInt("II"));
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s){

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C',100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            int value = romanValues.get(s.charAt(i));

            if(i + 1 < n && value < romanValues.get(s.charAt(i + 1)))
            {
                result -= value;
            }else{
                result += value;
            }

        }
        return result;

    }
}


//Converting roman numbers
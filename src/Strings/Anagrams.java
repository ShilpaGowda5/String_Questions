package Strings;
import java.util.Arrays;

public class Anagrams {                                     //Compares two strings at character level
    public static void main(String[] args) {
        String str1 = "faizan";
        String str2 = "naziafa";

//        if(str1.equals(str2)){
//            System.out.println("equals");
//        }else {
//            System.out.println("not equal");
//        }
//
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        if (Arrays.equals(charArray1, charArray2))
        {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
//        int i = 0;
//        int j = 0;
//
//        while (i < charArray1.length && j < charArray2.length) {
//            if (charArray1[i] == charArray2[j]) {                     //When told not to use the sort
                                                                     //function we have to use this code
//                j++;
//            }
//            i++;
//        }
//
//        if (j == charArray2.length) {
//            System.out.println("Strings are equal at character level");
//        } else {
//            System.out.println("Strings are not equal at character level");
//        }
    }

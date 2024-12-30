package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "civic";
        StringBuilder reverseStr = new StringBuilder();

        for(int i = s1.length()-1; i>=0; i--){
            reverseStr.append(s1.charAt(i));
        }
        if(s1.equalsIgnoreCase(reverseStr.toString())){
            System.out.println(s1 + " is a Palindrome");
        } else {
            System.out.println(s1 + " is not a Palindrome");
        }
    }
}

//Palindrome

//ALTERNATE CODE

//public class StringTemp {
//    public static void main(String[] args) {
//        String s1 = "racecar";
//        boolean isPalindrome = true;
//
//        int length = s1.length();
//        for (int i = 0; i < length / 2; i++) {
//            if (s1.charAt(i) != s1.charAt(length - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println(s1 + " is a Palindrome");
//        } else {
//            System.out.println(s1 + " is not a Palindrome");
//        }
//    }
//}


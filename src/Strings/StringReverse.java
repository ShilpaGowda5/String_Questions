package Strings;

public class StringReverse {

    public static void main(String[] args) {
        String s1 = "naziaf";
        StringBuilder reversed = reverseString(s1);
        System.out.println(reversed);
    }

    public static StringBuilder reverseString(String s1) {
        StringBuilder sb = new StringBuilder();

        for(int i = s1.length() - 1; i >= 0; i--) {
            sb.append(s1.charAt(i));
        }

        return sb;
    }
}

//Reverse the string



//Without using String Buffer

/*package Strings;

public class String2 {

    public static void main(String[] args) {
        String s1 = "naziaf";
        String reversed = reverseString(s1);
        System.out.println(reversed);
    }

    public static String reverseString(String s1) {
        String reversed = "";  // Create an empty string to store the reversed result

        for (int i = s1.length() - 1; i >= 0; i--) {
            reversed += s1.charAt(i);  // Concatenate characters in reverse order
        }

        return reversed;
    }
}*/




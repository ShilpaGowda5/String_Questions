package Strings;


public class StrLength {
    public static void main(String[] args) {
        String str = "Cadillac";
        int length = 0;

        for (char c : str.toCharArray()){
            length++;
        }
        System.out.println("The lenght of the string is: " + length);
    }
}


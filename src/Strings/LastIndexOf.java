package Strings;
public class LastIndexOf {
    public static void main(String[] args) {
        String basket = "rohihrori";
        char targetLetter = 'o';

        int lastrIndex = basket.lastIndexOf(targetLetter);
        System.out.println("The last occurrence of 'r' letter is at index: " + lastrIndex);
    }
}


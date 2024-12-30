package Strings;
public class StringCountVowels {

    public static void main(String[] args) {
        String str = "My name is $hilpA";
        int vowel = 0;
        int consonants = 0;
        int specialCharacter = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                vowel++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            } else if(!Character.isWhitespace(c)){
                specialCharacter++;
            }

        }
        System.out.println("No of vowels in the given string is:" + vowel);
        System.out.println("No of consonants in the given string is:" + consonants);
        System.out.println("No of special characters in the given string is:" + specialCharacter);

    }

}

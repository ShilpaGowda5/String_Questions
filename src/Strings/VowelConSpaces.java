package Strings;
public class VowelConSpaces {

    public static void main(String[] args) {
        String str="How are you";
        str=str.toLowerCase();
        int vowels=0,consonants=0,spaces=0;

        for(char c:str.toCharArray()) {
            if(c==' ') {
                spaces++;
            }
            else if(c>='a' && c<='z') {
                if("aeiou".indexOf(c)!=-1) {
                    vowels++;
                }
                consonants++;
            }
        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("Spaces: "+spaces);
        System.out.println(str.indexOf('p'));
    }
}

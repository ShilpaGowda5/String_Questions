package Strings;
public class LongestEvenWord {
    public static void main(String[] args) {
    String sentence = "The animal is a foxy";
    String[] words = sentence.split("\\s+");
    String longestEvenWord = "";
    for(String s: words){
        if(s.length()%2==0){
            if(s.length()>longestEvenWord.length()){
                longestEvenWord=s;
            }
        }
    }
        System.out.println("Longest even word is "+longestEvenWord);
}
}

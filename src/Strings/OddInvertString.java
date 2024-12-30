package Strings;
public class OddInvertString {
    public static void main(String[] args) {
        String input = "FaIzAn mUsHrAf";
        String inverted = invertString(input);
        System.out.println(inverted);
    }

        public static String invertString (String input) {
            StringBuilder sbu = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {   //for(where to start; till when to run the loop; inc)
                char c = input.charAt(i);
                if (i % 2 == 0) {                //If i want to perform a operation on the array which
                                                 // i am looping through for loop then i can use the if statement
                    sbu.append(Character.toUpperCase(c));
                } else {
                    sbu.append(Character.toLowerCase(c));
                }
            }
              return sbu.toString();
        }
}

//Inverts the string in alternate manner

package Strings;

class Main {
    public static void main(String[] args) {
        // Example usage of the removeWhiteSpaces method
        String input = "f a i z a n";
        String result = removeWhiteSpaces(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    // Method to remove whitespaces from a string
    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();

        // Convert the string into a character array
        char[] charArray = input.toCharArray();

        // Iterate over each character
        for (char c : charArray) {
            // Append non-whitespace characters to the StringBuilder
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }

        // Convert the StringBuilder to a String and return it
        return output.toString();
    }
}


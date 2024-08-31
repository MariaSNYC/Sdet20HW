package org.example.e139;

public class E139AccessModifiers {
    public static String alphabetical(String str){
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char lastChar = str.charAt(0);  // Initialize with the first character

        result.append(lastChar);  // Start result with the first character

        // Loop through the rest of the string
        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar > lastChar) {  // Compare with the last added character
                result.append(currentChar);
                lastChar = currentChar;  // Update lastChar to the current character
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {


        // Test the alphabetical method with examples
        System.out.println(alphabetical("hello"));      // Expected Output: "hlo"
        System.out.println(alphabetical("software"));   // Expected Output: "stwr"
        System.out.println(alphabetical("language"));   // Expected Output: "lnug"
    }
}




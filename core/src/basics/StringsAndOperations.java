package basics;

public class StringsAndOperations {

    public static void main(String[] args) {
        // Example usage of the string operations
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Concatenation: " + concatenateStrings(str1, str2));
        System.out.println("Length of String 1: " + getStringLength(str1));
        System.out.println("Does String 1 contain 'll': " + containsSubstring(str1, "ll"));
        System.out.println("String 1 in Uppercase: " + toUpperCase(str1));
    }

    // Method to concatenate two strings
    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2;
    }

    // Method to get the length of a string
    public static int getStringLength(String s) {
        return s.length();
    }

    // Method to check if a string contains a given substring
    public static boolean containsSubstring(String s, String substring) {
        return s.contains(substring);
    }

    // Method to convert a string to uppercase
    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

}

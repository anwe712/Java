package StringHandling;

public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Hello"; // Using string literal
        String str2 = new String("World"); // Using new keyword

        String result = str1 + ", " + str2; // Concatenation with +
        String result2 = str1.concat(", ").concat(str2); // Concatenation with concat()
        String sub = str1.substring(2); // Returns a new string "llo"

    }
}

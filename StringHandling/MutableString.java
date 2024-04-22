package StringHandling;

public class MutableString {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append characters to the StringBuilder
        stringBuilder.append(" World");

        // Insert characters at a specific position
        stringBuilder.insert(5, ", ");

        // Replace characters in the StringBuilder
        stringBuilder.replace(6, 11, "There");

        // Delete characters from the StringBuilder
        stringBuilder.delete(0, 6);

        // Convert StringBuilder to String
        String result = stringBuilder.toString();

        // Print the result
        System.out.println(result);  // Output: There, World
    }

}

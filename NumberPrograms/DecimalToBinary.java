package NumberPrograms;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number from the user
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary
        String binary = decimalToBinary(decimal);

        // Output the binary representation
        System.out.println("Binary representation: " + binary);

        scanner.close();
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int decimal) {
        // Handle the special case of 0 separately
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            // Get the remainder when dividing by 2
            int remainder = decimal % 2;
            // Add the remainder to the beginning of the binary string
            binary.insert(0, remainder);
            // Divide the number by 2 for the next iteration
            decimal = decimal / 2;
        }
        return binary.toString();
    }

}

package NumberPrograms;
import java.util.*;
public class ArmstrongNumber {
    // Function to calculate the power of a number
    public static int power(int num, int p) {
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= num;
        }
        return result;
    }
    
    // Function to check if a number is Armstrong or not
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += power(digit, numberOfDigits);
            num /= 10;
        }
        
        return originalNum == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}


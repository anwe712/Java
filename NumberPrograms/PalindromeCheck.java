import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if(isPalindrome(number))
            System.out.println(number + " is a palindrome number.");
        else
            System.out.println(number + " is not a palindrome number.");
        
        scanner.close();
    }

    // Function to check if a number is palindrome or not
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reverse;
    }
}

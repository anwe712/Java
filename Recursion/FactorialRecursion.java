package Recursion;
import java.util.*;


public class FactorialRecursion {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n * factorial(n-1)
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            int result = factorial(num);
            System.out.println("The factorial of " + num + " : " + result);
        }
    }
}

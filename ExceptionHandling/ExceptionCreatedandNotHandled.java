package ExceptionHandling;

public class ExceptionCreatedandNotHandled {
    try {
        // Some code that might throw an exception
        int result = divide(10, 0);
        System.out.println("Result: " + result); // This won't be reached if an exception occurs
    } catch (ArithmeticException e) {
        // Handle the exception
        System.out.println("An arithmetic exception occurred: " + e.getMessage());
    }
}

public static int divide(int numerator, int denominator) {
    if (denominator == 0) {
        // If denominator is zero, throw an ArithmeticException
        throw new ArithmeticException("Cannot divide by zero");
    }
    return numerator / denominator;
}

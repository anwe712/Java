package ExceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                // If age is less than 18, throw an ArithmeticException
                throw new ArithmeticException("Age must be 18 or above");
            }
            System.out.println("You are eligible to vote");
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException thrown in the try block
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}

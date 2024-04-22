package ExceptionHandling;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                // Inner try block
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[4]); // Trying to access an element out of bounds
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling ArrayIndexOutOfBoundsException
                System.out.println("Inner try block: An exception occurred: " + e.getMessage());
            }
            // Another statement in the outer try block
            String str = null;
            System.out.println(str.length()); // Trying to call a method on a null reference
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("Outer try block: An exception occurred: " + e.getMessage());
        }
    }
}

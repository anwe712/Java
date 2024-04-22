public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Trying to access an element out of bounds
            String str = null;
            System.out.println(str.length()); // Trying to call a method on a null reference
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Handling both ArrayIndexOutOfBoundsException and NullPointerException
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}

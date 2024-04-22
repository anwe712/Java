package ExceptionHandling;
// User-defined exception CheckArgumentException
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CommandLineArguments {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                // If the number of arguments is less than 5, throw CheckArgumentException
                throw new CheckArgumentException("Insufficient number of arguments provided");
            } else {
                // If the number of arguments is at least 5, calculate the sum of the first 5 arguments
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += Integer.parseInt(args[i]);
                }
                System.out.println("Sum of the first 5 arguments: " + sum);
            }
        } catch (CheckArgumentException e) {
            // Catch the CheckArgumentException and print the error message
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Catch NumberFormatException if any argument is not a valid integer
            System.out.println("Error: One or more arguments are not valid integers");
        }
    }
}


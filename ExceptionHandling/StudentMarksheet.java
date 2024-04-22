package ExceptionHandling;
// User-defined exception RangeException
class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class StudentMarksheet {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments are provided
        if (args.length != 7) {
            System.out.println("Usage: java StudentMarksheet <Student Name> <Marks1> <Marks2> <Marks3> <Marks4> <Marks5> <Marks6>");
            return;
        }

        // Get student name from command line arguments
        String studentName = args[0];

        // Parse marks from command line arguments
        int[] marks = new int[6];
        try {
            for (int i = 1; i <= 6; i++) {
                marks[i - 1] = Integer.parseInt(args[i]);
                if (marks[i - 1] < 0 || marks[i - 1] > 50) {
                    // If marks are not in the range 0-50, throw a RangeException
                    throw new RangeException("Marks should be between 0 and 50");
                }
            }

            // Calculate total marks and percentage
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }
            double percentage = (double) totalMarks / (6 * 50) * 100;

            // Print mark sheet
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        } catch (NumberFormatException e) {
            // Catch NumberFormatException if any argument is not a valid integer
            System.out.println("Error: One or more marks are not valid integers");
        } catch (RangeException e) {
            // Catch RangeException if any mark is out of range
            System.out.println("Error: " + e.getMessage());
        }
    }
}

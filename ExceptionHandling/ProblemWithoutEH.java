package ExceptionHandling;

public class ProblemWithoutEH {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            
            // Trying to access an element beyond the array length
            int index = 10;
            int result = numbers[index];
            
            // This line will never be reached due to the exception
            System.out.println("Result: " + result);
        }
    }
    


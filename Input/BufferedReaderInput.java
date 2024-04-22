import java.io.BufferedReader;  // Import karo BufferedReader class from java.io package
import java.io.IOException;  // Import karo IOException class from java.io package
import java.io.InputStreamReader;  // Import karo InputStreamReader class from java.io package

public class BufferedReaderInput {  // Class banao BufferedReaderInput naam se
    public static void main(String[] args) {  // main method define karo
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  // BufferedReader ka object banao jo System.in se input padega

        try {  // Try block shuru karo
            System.out.println("Please enter your name:");  // "Please enter your name:" print karo
            String name = reader.readLine();  // User ka naam padh kar store karo - its in string format
            
            System.out.println("Please enter your age:");  // "Please enter your age:" print karo
            int age = Integer.parseInt(reader.readLine());  // Integer input padh kar parse karo
            
            System.out.println("Please enter your favorite color:");  // "Please enter your favorite color:" print karo
            String color = reader.readLine();  // User ka favorite color padh kar store karo
            
            System.out.println("\nHi " + name + "! You are " + age + " years old and your favorite color is " + color + ".");  // Name, age, aur favorite color print karo
            
            // BufferedReader ko band karo
            reader.close();
        } catch (IOException e) {  // IOException handle karo
            System.err.println("Error reading input: " + e.getMessage());  // Error message print karo
        }
    }
}

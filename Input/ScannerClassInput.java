import java.util.Scanner;

public class ScannerClassInput {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");


        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
     
            
            System.out.println("Your name is : "+name);
        }
    
        
    }
    
    }
   
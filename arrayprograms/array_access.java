//INPUT ARRAY AND INDEX FROM USER 
package arrayprograms;

import java.util.* ;

public class array_access {
    public static void main(String[] args) {
        //lets make the array
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: "); // user input for the array length
            int n = sc.nextInt();
            int[] arr = new int[n];// array declared with the size

            for (int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt(); // taking input in the array from the user 

            }

            //to print the array 
            System.out.println("The array is : ");

            for (int i = 0 ; i < n ; i++)
            {
                System.out.print( (arr[i])+ " ");

            } 
        }
    }
}

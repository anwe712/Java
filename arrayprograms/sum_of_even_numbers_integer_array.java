package arrayprograms;
import java.util.*;
public class sum_of_even_numbers_integer_array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("The array length is: ");
      int  n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements in the array: ");


            for (int i = 0 ; i < arr.length ; i++){
                arr[i] = sc.nextInt();
                //taking of elements input from the user 

            }
            int sum = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
            System.out.println("The sum of the even integers in the array is : "+sum);

        
    }
}
}





    


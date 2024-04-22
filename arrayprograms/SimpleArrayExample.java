package arrayprograms;

import java.util.*;

public class SimpleArrayExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array :");

            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements in the array: ");

            for (int i = 0 ; i < arr.length ; i++){
                arr[i] = sc.nextInt();

            }
            System.out.println("the elements in the array: ");

            for (int i = 0 ; i < arr.length ; i++){
                System.out.print(arr[i]+ ",");

            }
            System.out.println();
           


        }


    }
}
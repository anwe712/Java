package NumberPrograms;

import java.util.Scanner;

public class NumberOfDigits {
    
    public int digitnos(int number )
    {

        int  count = 0;
        while (number > 0 )
        {
            count = count + 1 ;
            number = number / 10 ; 
        }
        return count ;
    }

    public  void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            System.out.println("number of digits = "+ digitnos(num));
        }
    }
}

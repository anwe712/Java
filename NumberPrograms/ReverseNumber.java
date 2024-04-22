package NumberPrograms;

import java.util.Scanner;

public class ReverseNumber {
    
    public int reverse(int n ){
        int copy = n , digit , sum = 0 ;

        while(copy > 0){
            digit = copy % 10 ;
            sum = (sum*10) + digit  ;
            copy = copy/ 10 ;
        }
        return sum ;
    }


public void main(String[]args)
{
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        System.err.println("The reverse of the number is : " + reverse(number));
    }
}
}



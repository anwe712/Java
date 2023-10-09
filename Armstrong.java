import java.util.Scanner;
public class Armstrong {
    public static void armstrongcheck(int a ) {
        int d , sum = 0;
        int copy = a ;
        while(copy > 0){
            d = copy % 10 ;
            sum = sum + (d*d*d) ;
            copy = copy / 10 ;

        }

        if (a == sum){
            System.out.println("It is a Armstrong number !");

        }
        else{
            System.out.println("It is not a Armstrong number");
        }

        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check:");
            int num = sc.nextInt();

            armstrongcheck(num);
        }
    }
}

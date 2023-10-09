import java.util.* ;
public class Hello {
    public static int sum(int a , int b) {

       int summation = a + b ; 
       System.out.println("The sum is "+summation);
       return summation;
    }

    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number(c):");
            int c = sc.nextInt();
            System.out.println("Enter the second number(d):");
            int d = sc.nextInt();
            sum(c,d);
        }
    }
}

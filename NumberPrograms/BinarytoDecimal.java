package NumberPrograms;
import java.util.Scanner;

public class BinarytoDecimal {

    public int digitnos(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public double BinarytoDecimal(int num) {
        int digit;
        double sum = 0;
        int length = digitnos(num); // Calculate the number of digits only once
        for (int i = 0; i < length; i++) { // Use < instead of <=
            digit = num % 10;
            sum += Math.pow(2, i) * digit;
            num = num / 10;
        }
        return sum;
    }

    public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to convert from Binary to decimal: ");
            int bin_num = sc.nextInt();

            BinarytoDecimal obj = new BinarytoDecimal(); // Create an object of the class
            System.out.println(obj.BinarytoDecimal(bin_num));
        }
    }
}

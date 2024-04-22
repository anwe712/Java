package FunctionsProgram;

import java.util.*;

public class iLeapYear {

    public int isLeapYear(int yr) {

        if (yr % 400 == 0 && yr % 100 == 0) {
            return 1;
        } else if (yr % 4 == 0 && yr % 100 != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the year you want to check: ");
            int year = sc.nextInt();

            if (isLeapYear(year) == 1) {
                System.out.println("This is a leap year");
            } else {
                System.out.println("This is not a leap year");
            }
        }
    }
}

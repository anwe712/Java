//WAP in Java define a class Employee to accept emp_id, emp_name, basic_salary from the user and display the gross_salary.

import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
    }

    double calculateGrossSalary() {
        return basic_salary * 1.2;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int emp_id = in.nextInt();
        System.out.println("Enter Employee Name:");
        String emp_name = in.next();
        
        // Handling the input for basic salary to ensure it's a valid double value
        double basic_salary = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter Basic Salary:");
                basic_salary = Double.parseDouble(in.next());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number for Basic Salary.");
            }
        }

        Employee emp = new Employee(emp_id, emp_name, basic_salary);
        double gross_salary = emp.calculateGrossSalary();
        System.out.println("Gross Salary: " + gross_salary);

        in.close();
    }
}


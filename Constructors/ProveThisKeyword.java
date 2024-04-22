package Constructors;
//Prove that this keyword refers to the current class instance variable java
public class ProveThisKeyword {
    private int x;

    // Constructor to initialize the instance variable 'x'
    public MyClass(int x) {
        this.x = x; // Here, 'this' refers to the current instance of MyClass
    }

    // Method to set the value of 'x' using 'this'
    public void setX(int x) {
        this.x = x; // 'this' is used to refer to the instance variable 'x'
    }

    // Method to get the value of 'x' using 'this'
    public int getX() {
        return this.x; // 'this' is used to refer to the instance variable 'x'
    }

    // Method to print the value of 'x' using 'this'
    public void printX() {
        System.out.println("Value of x: " + this.x); // 'this' is used to refer to the instance variable 'x'
    }

    // Main method to demonstrate the usage of 'this'
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass obj = new MyClass(10);

        // Invoking methods using 'obj'
        obj.printX(); // Output will be: Value of x: 10

        obj.setX(20);
        System.out.println("Updated value of x: " + obj.getX()); // Output will be: Updated value of x: 20
    }

}

package Constructors;
//Implementation of this keyword to pass as argument in the constructor call.

public class ThisPassAsArgument {
    private int x;
    private int y;

    // Constructor with two parameters
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor with a single parameter
    public MyClass(int x) {
        // Using 'this' to call the other constructor and passing 'x' as an argument
        this(x, 0); // Passes 'x' and 0 to the other constructor
    }

    // Method to display the values of 'x' and 'y'
    public void display() {
        System.out.println("x: " + x + ", y: " + y);
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        // Creating objects using both constructors
        MyClass obj1 = new MyClass(10, 20);
        MyClass obj2 = new MyClass(5);

        // Displaying the values
        System.out.print("obj1: ");
        obj1.display(); // Output will be: obj1: x: 10, y: 20
        System.out.print("obj2: ");
        obj2.display(); // Output will be: obj2: x: 5, y: 0
    }
}

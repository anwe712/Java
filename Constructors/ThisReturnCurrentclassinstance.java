package Constructors;
//Implement - this keyword can be used to return current class instance.

public class ThisReturnCurrentclassinstance {
    private int value;

    // Constructor to initialize the instance variable 'value'
    public MyClass(int value) {
        this.value = value;
    }

    // Method to add two MyClass objects and return the result as a new object
    public MyClass add(MyClass other) {
        int sum = this.value + other.value;
        return new MyClass(sum);
    }

    // Method to get the value of 'value' instance variable
    public int getValue() {
        return this.value;
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        // Creating two instances of MyClass
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        // Adding obj1 and obj2
        MyClass sumObj = obj1.add(obj2);

        // Displaying the result
        System.out.println("Sum of obj1 and obj2: " + sumObj.getValue()); // Output will be: Sum of obj1 and obj2: 30
    }
}

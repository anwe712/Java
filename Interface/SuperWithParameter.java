package Interface;

// Parent class
class Parent {
    int parentVariable;

    // Parameterized constructor
    Parent(int parentVariable) {
        this.parentVariable = parentVariable;
        System.out.println("Parent class constructor with parameter: " + parentVariable);
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    int childVariable;

    // Parameterized constructor
    Child(int parentVariable, int childVariable) {
        super(parentVariable); // Calling parent class constructor with parameter
        this.childVariable = childVariable;
        System.out.println("Child class constructor with parameter: " + childVariable);
    }
}

// Main class
public class SuperWithParameter {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child child = new Child(10, 20);
    }
}

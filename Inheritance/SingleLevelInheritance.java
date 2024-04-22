package Inheritance;

 
// Parent class
class Parent {
    void displayParent() {
        System.out.println("This is the Parent class");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    void displayChild() {
        System.out.println("This is the Child class");
    }
}

// Main class to demonstrate single inheritance
public class SingleLevelInheritance {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child childObj = new Child();

        // Calling methods of both Parent and Child class
        childObj.displayParent();
        childObj.displayChild();
    }
}
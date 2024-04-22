package Inheritance;
// Parent class
class Parent {
    // Method marked as final
    final void display() {
        System.out.println("This method cannot be overridden");
    }
}

// Child class attempting to override the final method (which is not allowed)
class Child extends Parent {
    // This will cause a compilation error
    // Attempting to override the final method is not allowed
    /*void display() {
        System.out.println("Attempting to override the final method");
    }*/
}

// Main class
public class MethodOverridePreventionDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Output: This method cannot be overridden
    }
}



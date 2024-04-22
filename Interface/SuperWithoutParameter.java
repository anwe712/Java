package Interface;

// Parent class
class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

// Child class inheriting from Parent class
class Child extends Parent {
    Child() {
        super(); // calling parent class constructor
        System.out.println("Child class constructor");
    }
}

// Main class
public class SuperWithoutParameter {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child child = new Child();
    }
}

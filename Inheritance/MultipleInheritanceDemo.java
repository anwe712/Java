package Inheritance;

// Parent class A
class A {
    void display() {
        System.out.println("A's display method");
    }
}

// Parent class B
class B {
    void display() {
        System.out.println("B's display method");
    }
}

// Child class C inheriting from A and B
class C extends A,B
{ // This line will cause a compilation error

    void display() {
        super.display(); // Ambiguity: Which superclass's display method to call?
    }
}

// Main class to demonstrate the issue with multiple inheritance
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}

package StaticKeyword;
//here we will implement the class keyword and understand its purpose

public class Implementation {
// Static variable
static int staticVar = 10;
    
// Static method
static void staticMethod() {
    System.out.println("This is a static method.");
}

// Non-static method
void nonStaticMethod() {
    System.out.println("This is a non-static method.");
}

public static void main(String[] args) {
    // Accessing static variable and method without creating an object
    System.out.println("Static variable: " + staticVar);
    staticMethod();
    
    // Creating an object of the class
    StaticExample obj = new StaticExample();
    
    // Accessing static variable and method using object
    System.out.println("Static variable using object: " + obj.staticVar);
    obj.staticMethod();
    
    // Accessing non-static method using object
    obj.nonStaticMethod();
}

    }


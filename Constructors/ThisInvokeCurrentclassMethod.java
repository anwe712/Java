package Constructors;
//Implementation of this keyword to invoke current class method
public class ThisInvokeCurrentclassMethod {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void anotherMethod() {
        // Invoking printValue() using 'this'
        this.printValue();
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        obj1.anotherMethod(); // Output will be: Value: 10
    }
}

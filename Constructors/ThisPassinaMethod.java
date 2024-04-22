package Constructors;
//Implementation of this keyword to pass as an argument in the method

public class ThisPassinaMethod {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void printValue(MyClass obj) {
        System.out.println("Value: " + obj.value);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        obj1.printValue(obj1);  // Passing 'this' explicitly
    }
}

package Constructors;

public class ParameterizedConstructor {
    private int myInt;
    private String myString;
    
    // Parameterized constructor
    public ParameterizedConstructor(int myInt, String myString) {
        this.myInt = myInt;
        this.myString = myString;
    }
    
    // Getter methods
    public int getMyInt() {
        return myInt;
    }
    
    public String getMyString() {
        return myString;
    }
    
    public static void main(String[] args) {
        // Creating an object of ParameterizedConstructor using parameterized constructor
        ParameterizedConstructor obj = new ParameterizedConstructor(10, "Hello");
        
        // Accessing object properties using getter methods
        System.out.println("My Int: " + obj.getMyInt());
        System.out.println("My String: " + obj.getMyString());
    }
}
package Constructors;

public class ThisKeyword {
    private int x;
    private int y;
    
    // Constructor
    public ThisKeyword(int x, int y) {
        this.x = x; // Using this keyword
        this.y = y; // Using this keyword
    }
    
    // Method to compare two instances of MyClass
    public boolean equals(ThisKeyword obj) {
        // Suppressing 'this' keyword for local variable obj
        return x == obj.x && y == obj.y;
    }
}



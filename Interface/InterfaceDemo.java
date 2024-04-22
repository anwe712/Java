package Interface;
// Interface representing a Shape
interface Shape {
    double calculateArea(); // Method to calculate area
    double calculatePerimeter(); // Method to calculate perimeter
}

// Class representing a Circle implementing Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea method from Shape interface
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing calculatePerimeter method from Shape interface
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5);

        // Calculate and display area and perimeter of the circle
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
    }
}



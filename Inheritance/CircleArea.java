package Inheritance;

import java.lang.Math;

// Point class representing a point in 2D space
class Point {
    private double x;
    private double y;

    // Constructor to initialize the coordinates of the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods for x and y coordinates
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Circle class representing a circle with a center point and radius
class Circle {
    private Point center; // Center of the circle
    private double radius;

    // Constructor to initialize the circle with center coordinates and radius
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class CircleArea {
    public static void main(String[] args) {
        // Create a point object representing the center of the circle
        Point center = new Point(0, 0); // Assume center at (0, 0)

        // Create a circle object with center and radius
        Circle circle = new Circle(center, 5); // Radius = 5 units

        // Calculate and display the area of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}

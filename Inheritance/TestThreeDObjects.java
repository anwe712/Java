import java.util.Scanner;

class ThreeDObject {
    // Default constructor
    public ThreeDObject() {
    }

    // Method to calculate whole surface area
    public double wholeSurfaceArea() {
        return 0;
    }

    // Method to calculate volume
    public double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    private double length, width, height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Override method to calculate whole surface area
    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // Override method to calculate volume
    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends Box {
    // Constructor
    public Cube(double side) {
        super(side, side, side);
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override method to calculate whole surface area
    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Override method to calculate volume
    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends Cylinder {
    // Constructor
    public Cone(double radius, double height) {
        super(radius, height);
    }
}

public class TestThreeDObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Box
        System.out.println("Enter dimensions for Box (length, width, height):");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box whole surface area: " + box.wholeSurfaceArea());
        System.out.println("Box volume: " + box.volume());

        // Input for Cube
        System.out.println("Enter side length for Cube:");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube whole surface area: " + cube.wholeSurfaceArea());
        System.out.println("Cube volume: " + cube.volume());

        // Input for Cylinder
        System.out.println("Enter dimensions for Cylinder (radius, height):");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder whole surface area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder volume: " + cylinder.volume());

        // Input for Cone
        System.out.println("Enter dimensions for Cone (radius, height):");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone whole surface area: " + cone.wholeSurfaceArea());
        System.out.println("Cone volume: " + cone.volume());

        scanner.close();
    }
}

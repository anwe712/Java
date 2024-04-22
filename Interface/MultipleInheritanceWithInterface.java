package Interface;

// Interface for flying behavior
interface Flying {
    void fly(); // Method to represent flying behavior
}

// Interface for swimming behavior
interface Swimming {
    void swim(); // Method to represent swimming behavior
}

// Class implementing both Flying and Swimming interfaces
class Bird implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }
}

// Main class to demonstrate multiple inheritance using interfaces
public class MultipleInheritanceWithInterface {
    public static void main(String[] args) {
        // Create an object of Bird class
        Bird bird = new Bird();

        // Demonstrate flying and swimming behaviors of Bird
        System.out.println("Behaviors of Bird:");
        bird.fly();
        bird.swim();
    }
}

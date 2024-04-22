package Interface;

// Parent class
class Animal {
    String color = "White";

    void display() {
        System.out.println("Color: " + color);
    }
}

// Child class inheriting from Animal class
class Dog extends Animal {
    String color = "Black";

    // Method overriding
    void display() {
        System.out.println("Color (child): " + color); // Child class color
        System.out.println("Color (parent): " + super.color); // Parent class color
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();

        // Calling methods of the Dog class
        dog.display();
        dog.bark();
    }
}

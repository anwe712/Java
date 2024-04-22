package Inheritance;
// Parent class
class Animal {
    // Method to make sound
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inheriting from Animal class
class Dog extends Animal {
    // Override the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class inheriting from Animal class
class Cat extends Animal {
    // Override the sound method
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate dynamic method dispatch
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Animal animal1 = new Dog(); // Dynamic method dispatch
        Animal animal2 = new Cat(); // Dynamic method dispatch

        // Calling the sound method of Dog class through Animal reference
        animal1.sound(); // This will print "Dog barks"

        // Calling the sound method of Cat class through Animal reference
        animal2.sound(); // This will print "Cat meows"
    }
}


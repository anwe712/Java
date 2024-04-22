package Inheritance;

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inheriting from Animal class
class Dog extends Animal {
    // Overriding the sound method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class to demonstrate method overriding

public class MethodOverriding {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog();

        // Calling the sound method of Dog class
        dog.sound(); // This will print "Dog barks"
    }
}


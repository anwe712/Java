package Inheritance;

    // Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inheriting from Animal class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Puppy class inheriting from Dog class
class Puppy extends Dog {
    void sound() {
        System.out.println("Puppy squeaks");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Puppy classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        // Calling sound method for objects of all three classes
        animal.sound();
        dog.sound();
        puppy.sound();
    }
}



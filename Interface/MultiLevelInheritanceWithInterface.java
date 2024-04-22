package Interface;

// Interface for Animal
interface Animal {
    void sound(); // Method to produce a sound
}

// Interface for Mammal
interface Mammal extends Animal {
    void giveBirth(); // Method representing giving birth
}

// Interface for Carnivore
interface Carnivore extends Animal {
    void hunt(); // Method representing hunting behavior
}

// Dog class implementing Mammal interface
class Dog implements Mammal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth to puppies");
    }
}

// Lion class implementing Carnivore interface
class Lion implements Carnivore {
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts for prey");
    }
}

// Main class to demonstrate multi-level inheritance with interfaces
public class MultiLevelInheritanceWithInterface {
    public static void main(String[] args) {
        // Create objects of Dog and Lion classes
        Dog dog = new Dog();
        Lion lion = new Lion();

        // Demonstrate behaviors of Dog and Lion
        System.out.println("Behaviors of Dog:");
        dog.sound();
        dog.giveBirth();

        System.out.println("\nBehaviors of Lion:");
        lion.sound();
        lion.hunt();
    }
}

package Interface;
// Parent interface
interface Animal {
    void sound(); // Method to produce a sound
}

// Child interface inheriting from Animal interface
interface Mammal extends Animal {
    void giveBirth(); // Method representing giving birth
}

// Grandchild interface inheriting from Mammal interface
interface Carnivore extends Mammal {
    void hunt(); // Method representing hunting behavior
}

// Dog class implementing Carnivore interface
class Dog implements Carnivore {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void giveBirth() {
        System.out.println("Dog gives birth to puppies");
    }

    @Override
    public void hunt() {
        System.out.println("Dog hunts for prey");
    }
}

// Main class to demonstrate inheritance in interfaces
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog();

        // Demonstrate behaviors of Dog
        System.out.println("Behaviors of Dog:");
        dog.sound();
        dog.giveBirth();
        dog.hunt();
    }
}

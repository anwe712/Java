package Interface;

// Interface Player
interface Player {
    void play(); // Abstract method
}

// Child class implementing Player interface
class Child implements Player {
    @Override
    public void play() {
        System.out.println("Playing means having fun for a child.");
    }
}

// Musician class implementing Player interface
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("Playing means performing music for a musician.");
    }
}

// Actor class implementing Player interface
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("Playing means acting on stage for an actor.");
    }
}

// Main class demonstrating the use of the classes
public class UsePlayer {
    public static void main(String[] args) {
        // Create objects of Child, Musician, and Actor classes
        Child child = new Child();
        Musician musician = new Musician();
        Actor actor = new Actor();

        // Call the play() method for each object
        System.out.println("Child:");
        child.play();

        System.out.println("\nMusician:");
        musician.play();

        System.out.println("\nActor:");
        actor.play();
    }
}

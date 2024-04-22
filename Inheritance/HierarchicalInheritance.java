package Inheritance;


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
    
    // Cat class inheriting from Animal class
    class Cat extends Animal {
        void sound() {
            System.out.println("Cat meows");
        }
    }
    
    // Main class to demonstrate hierarchical inheritance
    public class HierarchicalInheritance {
        public static void main(String[] args) {
            // Creating objects of Dog and Cat classes
            Dog dog = new Dog();
            Cat cat = new Cat();
    
            // Calling sound method for Dog and Cat objects
            dog.sound();
            cat.sound();
        }
    }


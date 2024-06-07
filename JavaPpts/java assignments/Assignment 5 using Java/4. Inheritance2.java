//WAP in Java implementing hierarchical inheritance.

// Superclass
class Animal 
{
   	void eat() 
	{
        	System.out.println("Animal is eating");
    	}
}

// Subclass 1
class Dog extends Animal 
{
   	void bark() 
	{
        	System.out.println("Dog is barking");
    	}
}

// Subclass 2
class Cat extends Animal 
{
   	void meow() 
	{
        	System.out.println("Cat is meowing");
    	}
}

public class Inheritance2 	
{
   	public static void main(String[] args) 
	{
        	Dog dog = new Dog();
        	Cat cat = new Cat();
        
        	dog.bark(); 
        	dog.eat();  
     
       		cat.meow(); 
       		cat.eat(); 
    }
}

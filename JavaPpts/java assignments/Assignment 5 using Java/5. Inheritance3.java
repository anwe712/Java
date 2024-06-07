//WAP in Java implementing multilevel inheritance.
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

// Subclass 2 (inherits from Dog)
class Labrador extends Dog 
{
   	void color() 
	{
        	System.out.println("Labrador is black");
    	}
}

public class Inheritance3 
{
   	public static void main(String[] args) 
	{
        	Labrador labrador = new Labrador();
        
        	labrador.bark(); 
        	labrador.eat();  
        	labrador.color(); 
    }
}

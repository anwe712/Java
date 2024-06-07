//WAP in Java to stop method overriding. 
class Animal 
{
   	void makeSound() 
	{
        	System.out.println("Animal makes a sound");
    	}
    	final void finalMethod() 
	{
        	System.out.println("This method cannot be overridden");
    	}
}
class Dog extends Animal 
{
	void makeSound() 
	{
        	System.out.println("Dog barks");
    	}
}

public class Method_Overriding2
{
   	public static void main(String[] args) 
	{
        	Animal animal = new Animal();
        	animal.makeSound(); 
        	animal.finalMethod(); 
        
      		Dog dog = new Dog();
        	dog.makeSound(); 
        	dog.finalMethod(); 
    }
}

//WAP in Java implementing method overriding. 
class Animal 
{
   	void sound() 
	{
        	System.out.println("Animal makes a sound");
    	}
}
class Dog extends Animal 
{
    	void sound() 
	{
        	System.out.println("Dog barks");
    	}
}

public class Method_Overriding
{
   	public static void main(String[] args) 
	{
        	Animal animal = new Animal();
        	Dog dog = new Dog();
        
        	animal.sound(); 
        	dog.sound();   
    	}
}

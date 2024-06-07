//WAP in Java implementing dynamic method dispatch. 
class Animal 
{
   	void makeSound() 
	{
        	System.out.println("Animal makes a sound");
    	}
}
class Dog extends Animal 
{
   	void makeSound() 
	{
        	System.out.println("Dog barks");
    	}
}
class Cat extends Animal 
{
   	void makeSound() 
	{
        	System.out.println("Cat meows");
    	}
}

public class Dynamic_method 
{
   	public static void main(String[] args) 
	{
        	Animal animal = new Dog();
        	animal.makeSound();
        	animal = new Cat();
        	animal.makeSound(); 
    }
}

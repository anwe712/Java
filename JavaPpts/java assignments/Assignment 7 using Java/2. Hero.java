//WAP in Java implementing final keyword before a method. 
class Cycle
{  
	final void move()
	{
		System.out.println("running");
	} 
}
  
class Hero extends Cycle
{  
	void move()
	{
		System.out.println("Moving with two wheel");
	}  
	public static void main(String args[])
	{  
		Hero obj= new Hero();  	
		obj.move();  
   	} 
} 

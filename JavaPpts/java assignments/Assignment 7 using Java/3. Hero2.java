//WAP in Java implementing final keyword before a class.
final class Cycle
{
	void run()
	{
		System.out.println("run");
	}  
}
class Hero2 extends Cycle	
{  
	void run()
	{
		System.out.println("Running");
	}  
	public static void main(String args[])
	{  
		Hero2 obj= new Hero2();  
		obj.run();  
	}  
}  

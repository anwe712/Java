//WAP in Java implementing final keyword before a variable. 
class Cycle
{  
	final int speed=30;
	void run()
	{	
		speed=30;  
	}  
	public static void main(String args[])
	{  
		Cycle obj=new  Cycle();  
		obj.run();  
	}
}

//WAP in Java to implement this keyword as a local variable suppressor. 
class This7 
{
	int x;
	This7(int x) 
	{
        	this.x = x;
        	display();
    	}
	void display() 
	{
        	int x = 20;
        	System.out.println("Local variable x: " + x);
        	System.out.println("Instance variable x: " + this.x);
    	}
	public static void main(String[] args) 
	{
        	This7 obj = new This7(15);
    	}
}

//WAP in Java to prove that this keyword refers to the current class instance variable.
class This6 
{
    	int x;
	This6(int x) 
	{
        	this.x = x;
    	}
	void display() 
	{
        	int x = 10;
        	System.out.println("Local variable x: " + x);
        	System.out.println("Instance variable x: " + this.x);
    	}
	public static void main(String[] args) 
	{
        	This6 obj = new This6(5);
        	obj.display();
    	}
}

//WAP in Java to implement this keyword to invoke current class constructor.
class This2 
{
    	int x;
    	This2(int x) 
	{
        	this.x = x;
        	System.out.println("Constructor invoked with parameter: " + x);
    	}
    	This2() 
	{
        	this(10);
        	System.out.println("Default Constructor invoked");
    	}
	public static void main(String[] args) 
	{
        	This2 obj = new This2();
    	}
}

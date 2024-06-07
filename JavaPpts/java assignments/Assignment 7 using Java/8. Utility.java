//WAP in Java for different types of access specifiers

public class Utility 
{
	public void publicMethod() 
	{
        	System.out.println("This is a public method.");
	}
	private void privateMethod() 
	{
        	System.out.println("This is a private method.");
    	}
	protected void protectedMethod() 
	{
        	System.out.println("This is a protected method.");
    	}
	void defaultMethod() 
	{
        	System.out.println("This is a default method.");
	}
	public static void main(String args[])
	{
		Utility ob=new Utility();
		ob.publicMethod();
		ob.privateMethod();
		ob.protectedMethod();
		ob.defaultMethod();
	}
}

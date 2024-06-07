//WAP in Java to implement this keyword to pass as an argument in the constructor call.
class This4 
{
	This4(This4 obj) 
	{
        	System.out.println("Constructor invoked with object: " + obj);
    	}
	public static void main(String[] args) 
	{
        	This4 obj1 = new This4(new This4(null));
    	}
}

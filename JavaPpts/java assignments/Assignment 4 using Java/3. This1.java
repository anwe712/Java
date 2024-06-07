//WAP in Java to implement this keyword to invoke current class method.
class This1
{
	void myMethod() 
	{
        	System.out.println("Inside myMethod");
    	}
 	void anotherMethod() 
	{
        	this.myMethod();
        	System.out.println("Inside anotherMethod");
    	}
	public static void main(String[] args) 
	{
        	This1 obj = new This1();
        	obj.anotherMethod();
	}
}

//WAP in Java to implement this keyword to pass as an argument in the method. 
class This3 
{
    	void display() 
	{
        	System.out.println("Inside display method");
    	}
	void invokeDisplay(This3 obj) 
	{
        	obj.display();
    	}
	public static void main(String[] args) 
	{
        	This3 obj = new This3();
        	obj.invokeDisplay(obj);
    	}
}

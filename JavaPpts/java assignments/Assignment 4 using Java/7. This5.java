//WAP in Java to implement this keyword that can be used to return current class instance.
class This5 
{
	int value;
	This5 setValue(int value) 
	{
        	this.value = value;
        	return this; 
    	}
	void display() 
	{
        	System.out.println("Value: " + value);
    	}
	public static void main(String[] args) 
	{
        	This5 obj = new This5();
        	obj.setValue(42).display();
    	}
}

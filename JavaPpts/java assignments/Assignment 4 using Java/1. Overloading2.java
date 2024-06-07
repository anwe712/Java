//Overloading by change of data type of parameter.
class Overloading2
{
	void name(String n)
	{
		System.out.println("The name is: "+n);
	}
	void name(int n)
	{
		System.out.println("Roll number is: "+n);
	}
	public static void main(String args[])
	{
		Overloading2 ob=new Overloading2();
		ob.name("Sayan Paul");
		ob.name(44);
	}
}
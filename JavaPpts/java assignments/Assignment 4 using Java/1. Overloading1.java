//Overloading by change in  number of parameter
class Overloading1
{
	int area(int a)
	{
		int A=a*a;
		return A;
	}
	int area(int a, int b)
	{
		int A=a*b;
		return A;
	}
	public static void main(String args[])
	{
		Overloading1 ob=new Overloading1();
		System.out.println("Area of square: "+ob.area(8));
		System.out.println("Area of rectangle: "+ob.area(10,44));
	}
}
//WAP in Java implementing Constructor Overloading
class Student
{
	String name;
	int r;
	Student(String n, int x)
	{
		name=n;
		r=x;
	}
	Student(String n)
	{
		name=n;
	}
	void display()
	{
		System.out.println("The name of the student is: "+name);
		System.out.println("The roll number is: "+r);
	}
	public static void main(String args[])
	{
		Student ob1=new Student("Sayan Paul",44);
		ob1.display();
		Student ob2=new Student("Sayan Paul");
		ob2.display();
	}
}
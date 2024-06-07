//WAP in Java to calculate the sum of natural number upto a certain range. 
import java.util.*;
class Natural
{
	int sum(int n)
	{
		int s=0;
		for(int i=1; i<=n; i++)
		{
			s=s+i;
		}
		return s;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);	
		Natural ob=new Natural();
		System.out.println("Enter your range: ");
		int n=in.nextInt();
		System.out.println("Sum of range is: "+ob.sum(n));
	}
}
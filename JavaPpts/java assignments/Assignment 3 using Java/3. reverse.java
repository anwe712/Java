//WAP in Java to reverse a number. 
import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=in.nextInt();
		int m=n;
		int a=0;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			a=a*10+r;
		}
		System.out.println("The reverse of "+m+" is "+a);
	}
}
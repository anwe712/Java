//WAP in Java to check whether a number is palindrome or not. 
import java.util.*;
class palindrome
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
		if(a==m)
			System.out.println(m+" is palindrome");
		else
			System.out.println(m+" is not palindrome");
	}
}
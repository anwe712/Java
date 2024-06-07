import java.util.*;

public class Prime 
{
    	int isPrime(int n) 
	{
        	if (n <= 1) 
		{
            		return 0; 
        	}

        	int c = 0;
        	for (int i = 2; i <= Math.sqrt(n); i++) 
		{
            		if (n % i == 0) 
			{
                		c++;
                		break; 
            		}
        	}

        	if (c == 0) 
		{
            		return 1; 
        	} 
		else 
		{
            		return 0;
        	}
    	}
	public static void main(String args[]) 
	{
        	Scanner in = new Scanner(System.in);
        	System.out.println("Enter a number: ");
        	int n = in.nextInt();
        	Prime ob = new Prime();
        	if (ob.isPrime(n) == 1)
            		System.out.println(n + " is prime");
        	else
            		System.out.println(n + " is not prime");
    }
}

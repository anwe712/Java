//WAP in Java implementing static method.
public class Static2 
{
   	public static int findMax(int num1, int num2) 
	{
        	return Math.max(num1, num2);
    	}
    
    	public static void main(String[] args) 
	{
        	int a = 10;
        	int b = 20;
        
        	int max = findMax(a, b);
        	System.out.println("The maximum of " + a + " and " + b + " is: " + max); 
    }
}

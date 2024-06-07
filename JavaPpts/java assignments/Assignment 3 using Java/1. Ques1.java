import java.io.*;
class Input1
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader in= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("Enter a number: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("The number is: "+n);
	}
}
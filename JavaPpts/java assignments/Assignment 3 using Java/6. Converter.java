//WAP in java to convert binary number to decimal and decimal to binary
import java.util.*;

public class Converter 
{
    	static int binaryToDecimal(String binary) 
	{
        	return Integer.parseInt(binary, 2);
    	}
    	static String decimalToBinary(int decimal) 
	{
        	return Integer.toBinaryString(decimal);
    	}
	public static void main(String[] args) 
	{
        	Scanner in= new Scanner(System.in);
        	System.out.println("Enter a binary number: ");
        	String binaryInput = in.nextLine();
        	int decimalResult = binaryToDecimal(binaryInput);
        	System.out.println("Decimal equivalent: " + decimalResult);

        	System.out.println("Enter a decimal number: ");
        	int decimalInput = in.nextInt();
        	String binaryResult = decimalToBinary(decimalInput);
        	System.out.println("Binary equivalent: " + binaryResult);

        	in.close();
    	}
}

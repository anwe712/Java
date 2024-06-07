//WAP in Java to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional value.
class Fraction 
{
	int numerator, denominator;
	Fraction() 
	{
        	numerator = 0;
        	denominator = 1;
    	}
	Fraction(int numerator, int denominator) 
	{
        	this.numerator = numerator;
        	this.denominator = denominator;
    	}
	void displayFraction() 
	{
        	System.out.println(numerator + "/" + denominator);
    	}
}

public class FractionTest 
{
   	public static void main(String[] args) 
	{
        	Fraction ob1 = new Fraction(); // Default constructor
        	Fraction ob2 = new Fraction(3, 4); // Parameterized constructor
        	Fraction ob3 = new Fraction(5, 8); // Parameterized constructor

        	System.out.print("Fraction 1: ");
        	ob1.displayFraction();
        	System.out.print("Fraction 2: ");
        	ob2.displayFraction();
        	System.out.print("Fraction 3: ");
        	ob3.displayFraction();
    	}
}

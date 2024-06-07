import java.util.*;

class Box 
{
	long wholeSurfaceArea(int l, int b, int h) 
	{
        	long area = 2 * (l * b + b * h + h * l);
        	return area;
    	}
	long volume(int l, int b, int h) 
	{
        	long vol = l * b * h;
        	return vol;
    	}
}

class Cube 
{
	long wholeSurfaceArea(int l) 
	{
        	return 6 * l * l;
    	}
	long volume(int l) 
	{
        	return l * l * l;
    	}
}

class Cylinder 
{
	double wholeSurfaceArea(int r, int h) 
	{
        	return 2 * 3.14 * r * (r + h);
    	}
	double volume(int r, int h) 
	{
        	return 3.14 * r * r * h;
    	}
}

class Cone 
{
    	double wholeSurfaceArea(int r, int h) 
	{
        	return 3.14 * r * (r + Math.sqrt(r * r + h * h));
    	}
	double volume(int r, int h) 
	{
        	return (1.0 / 3) * 3.14 * r * r * h;
    	}
}

public class ThreeDObject 
{
	public static void main(String args[]) 
	{
        	Scanner in = new Scanner(System.in);
        	Box ob1 = new Box();

        	System.out.println("Enter the dimensions of a box: ");
        	int l = in.nextInt();
        	int b = in.nextInt();
        	int h = in.nextInt();
        	System.out.println("Surface Area of box is: " + ob1.wholeSurfaceArea(l, b, h));
        	System.out.println("Volume of box is: " + ob1.volume(l, b, h));

        	Cube ob2 = new Cube();
        	System.out.println("Enter the side of a cube: ");
        	int a = in.nextInt();
        	System.out.println("Surface area of cube is: " + ob2.wholeSurfaceArea(a));
        	System.out.println("Volume of cube is: " + ob2.volume(a));

        	Cylinder ob3 = new Cylinder();
        	Cone ob4 = new Cone();
        	System.out.println("Enter the base and height of Cylinder and Cone: ");
        	int radius = in.nextInt();
        	int height = in.nextInt();
        	System.out.println("Surface area of cylinder is: " + ob3.wholeSurfaceArea(radius, height));
        	System.out.println("Volume of cylinder is: " + ob3.volume(radius, height));
        	System.out.println("Surface area of cone is: " + ob4.wholeSurfaceArea(radius, height));
        	System.out.println("Volume of cone is: " + ob4.volume(radius, height));
    }
}

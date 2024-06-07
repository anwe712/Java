/*WAP in Java to create a "circle" class & a "point" class. The coordinates of the circle are given and used within the "circle" class as object of the "point" class. Display the area of circle.*/
class Point 
{
   	int x, y;
	Point(int x, int y) 
	{
        	this.x = x;
        	this.y = y;
    	}
}
class Circle 
{
   	Point center;
   	double radius;

	Circle(Point center, double radius) 
	{
        	this.center = center;
        	this.radius = radius;
   	}

   	double calculateArea() 
	{
        	return Math.PI * radius * radius;
    	}
}

public class CircleTest 
{
   	public static void main(String[] args) 
	{
        	Point center = new Point(0, 0);
        	double radius = 5.0;
        	Circle circle = new Circle(center, radius);
        	double area = circle.calculateArea();
        	System.out.println("Area of the circle: " + area);
    }
}

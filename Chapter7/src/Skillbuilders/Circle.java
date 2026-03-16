package Skillbuilders;

public class Circle 
{
	private double radius;
	
	public Circle()//default constructor method
	{
		radius = 1.0;
	}
	
	public Circle(double r)//overload constructor
	{
		radius = r;
	}
	
	public double getRadius()//Accessor
	{
		return radius;
	}
	public void setRadius(double r)//Modifier
	{
		if(r > 0)
			radius = r;
		else
			System.out.println("Error: Radius must be positive.");
	}
	
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString()
	{
		return "Circle[radius = " + radius + ", area =" + calculateArea() + "]";
	}
}









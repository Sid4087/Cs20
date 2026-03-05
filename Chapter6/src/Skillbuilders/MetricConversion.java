package Skillbuilders;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MetricConversion 
{
	static DecimalFormat dcf = new DecimalFormat("0.00");
	//COnvertiung inches to centimeters
	public static void inchesToCentimeters(int number)
	{
		double answer;
		
		answer = number * 2.54;
		
		System.out.println("\n"+ dcf.format(number) + " inches equals " + answer + " centimeters.");
	}
	
	
	public static void feetToCentimeters(int number)
	{
		double answer;
		
		answer = number * 30.48;
		
		System.out.println("\n"+ dcf.format(number) + " feet equals " + answer + " centimeters.");
	}
	
	
	public static void yardsToMeters(int number)
	{
		double answer;
		
		answer = number * 0.91;
		
		System.out.println("\n"+ dcf.format(number) + " yards equals " + answer + " meters.");
	}
	
	
	public static void mileToKilometers(int number)
	
	{
		double answer;
		
		answer = number * 1.61;
		
		System.out.println("\n"+ dcf.format(number) + " miles equals " + answer + " kilometers.");
	
	}
	
	
	public static void centimetersToInches(int number)
	
	{
		double answer;
		
		answer = number * 0.3937;
		
		System.out.println("\n"+ dcf.format(number) + " centimeters equals " + answer + " inches.");
	
	}
	
	
	public static void centimetersToFeet(int number)
	
	{
		double answer;
		
		answer = number * 0.0328;
		
		System.out.println("\n"+ dcf.format(number) + " centimeters equals " + answer + " feet.");
	
	}
	
	
	public static void metersToYards(int number)
	
	{
		double answer;
		
		answer = number * 1.09;
		
		System.out.println("\n"+ dcf.format(number) + " meters equals " + answer + " yards.");
	
	}
	
	public static void kilometersToMiles(int number)
	
	{
		double answer;
		
		answer = number * 0.62;
		
		System.out.println("\n"+ dcf.format(number) + " kilometers equals " + answer + "miles.");
	
	}
	
	public static void main(String[] args)
	{
		int choice;
		int number;
		java.util.Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number:");
		number = input.nextInt();
		
		System.out.println("Convert:");
		System.out.println("1. Inches to Centimeters\t" + "5. Centimeters to Inches");
		System.out.println("2. Feet to centimeters\t" + "6. Centimeters to Feet");
		System.out.println("3. Yards to Meters\t" + "7. Meters to Yards");
		System.out.println("4. Miles to Kilometers\t" + "5. Kilometers to Miles");
		
		System.out.println("Enter your choice: ");
		
		choice = input.nextInt();
		
		switch(choice)
		{
		case 1 : inchesToCentimeters(number);break;
		case 2 : feetToCentimeters(number);break;
		case 3 : yardsToMeters(number);break;
		case 4 : mileToKilometers(number);break;
		case 5 : centimetersToInches(number);break;
		case 6 : centimetersToFeet(number);break;
		case 7 : metersToYards(number);break;
		case 8 : kilometersToMiles(number);break;
		

		}
		
	}
}
































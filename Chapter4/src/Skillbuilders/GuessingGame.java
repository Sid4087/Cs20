package Skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		//Game setup
		int secretNumber = random.nextInt(30) + 1;
		
		//Output
		
		System.out.println("Guess the number (1-30):");
		System.out.println("Enter Guess: ");
		
		//Input
		int guess = input.nextInt();
	}

}

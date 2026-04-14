/*
Program: LunchOrder.java   Last Date of this Revision: April 9,2026

Purpose: Create an application that generates 25 random integers between 0-99 and then displays 
all the even numbers and all of the odd numbers.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;

import java.util.Random;

public class EvensAndOdds 
{
	public static void main(String[] args) 
	{
		// Initialize the random number generator and an array to hold 25 integers
		Random rand = new Random();
		int[] nums = new int[25];
		
		// Fill the array with random numbers ranging from 0 to 99
		for (int i = 0; i < nums.length ; i++)
		{
			nums[i] = rand.nextInt(100);
		}
		
		// --- Process and print Odd numbers ---
		System.out.println("Odd: ");
		for(int num : nums)
		{
			// A number is odd if the remainder when divided by 2 is not zero
			if (num % 2 != 0)
			{
				System.out.print(num + " ");
			}
		}
		
		// --- Process and print Even numbers ---
		System.out.println("\nEven: ");
		for(int num : nums)
		{
			// A number is even if the remainder when divided by 2 is exactly zero
			if (num % 2 == 0)
			{
				System.out.print(num + " ");
			}
		}
	}
}

/*

Odd: 
91 79 67 33 21 51 41 53 9 79 59 85 73 35 1 
Even: 
54 12 86 6 28 38 46 78 86 70 
 
 */

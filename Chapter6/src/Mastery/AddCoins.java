/*
Program: AddCoins.java   Last Date of this Revision: March 12,2026

Purpose: The purpose of this code is to add coins that a user enters 
and display the total dollar amount.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;

import java.util.Scanner;

public class AddCoins 
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // Scanner for user input
        
        System.out.println("Enter your total coins:");
        
        // Ask user for number of quarters
        System.out.print("\nQuarters: ");
        int quarters = input.nextInt();
        
        // Ask user for number of dimes
        System.out.print("Dimes: ");
        int dimes = input.nextInt();
        
        // Ask user for number of nickels
        System.out.print("Nickels: ");
        int nickels = input.nextInt();
        
        // Ask user for number of pennies
        System.out.print("Pennies: ");
        int pennies = input.nextInt();
        
        // Call method to calculate total dollar amount
        String total = getDollarAmount(quarters, dimes, nickels, pennies);
        
        // Display the formatted total
        System.out.print("\nTotal: " + total);

    }

    // Method that converts coin counts into a formatted dollar amount
    public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies) 
    {
        // Convert all coins to cents
        double total = pennies + nickels * 5 + dimes * 10 + quarters * 25;
        
        // Convert cents to dollars
        double dollars = total / 100;
        
        // Return formatted dollar amount (e.g., $1.08)
        return String.format("$%.2f", dollars);
    }
}

/* Screen Dump
 
Enter your total coins:

Quarters: 3
Dimes: 2
Nickels: 1
Pennies: 8

Total: $1.08
 
*/

/*
Program: DiceRolls.java   Last Date of this Revision: March 6,2026

Purpose: The purpose of this code is to roll two dice five times each
and display each roll,and total for the two dice combined. 


Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;

import java.util.Random;

public class DiceRolls {
    public static void main(String[] args) {

        // Create a Random object to generate dice values
        Random rand = new Random();

        // Print table headers for the output
        System.out.println("Dice 1\tDice 2\tTotal");

        // Roll the dice 5 times
        for (int i = 0; i < 5; i++) 
        {
            // Generate a random number from 1 to 6 for each die
            int dice1 = rand.nextInt(6) + 1; 
            int dice2 = rand.nextInt(6) + 1; 

            // Calculate the total of the two dice
            int total = dice1 + dice2;

            // Display the results of this roll
            System.out.println(dice1 + "\t" + dice2 + "\t" + total);
        }
    }
}

        
    

/*ScreenDump

Dice 1	Dice 2	Total
6	    4	    10
1		1		2
6		4		10
3		3		6
2		5		7

*/
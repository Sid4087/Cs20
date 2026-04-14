/*
Program: RandomStats.java   Last Date of this Revision: April 14,2026

Purpose: Create an application that generates 500 random numbers between 0-9 and then displays 
number of occurrences of each number.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;
import java.util.Random;

public class RandomStats 
{
    public static void main(String[] args) 
    {
        // counts[0] will store occurrences of 0, counts[1] for 1, and so on.
        int[] counts = new int[10];
        Random rand = new Random();

        // Generate 500 random numbers and increment the corresponding index
        for (int i = 0; i < 500; i++) 
        {
            // Generate a random number between 0 (inclusive) and 10 (exclusive)
            int num = rand.nextInt(10);
            
            // Increment the value at the index matching the random number
            counts[num]++;
        }

        // Print header with a tab (\t) for alignment
        System.out.println("Number\tOccurrences");

        // Iterate through the counts array to display the final tallies
        for (int n = 0; n < 10; n++) 
        {
            System.out.println(n + "\t" + counts[n]);
        }
    }        
}
/*

Number	Occurrences
0		54
1		50
2		52
3		57
4		38
5		64
6		40
7		36
8		55
9		54
 
*/


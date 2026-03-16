/*
Program: House.java   Last Date of this Revision: March 16,2026

Purpose: The purpose of the code is to display a house by printing the roof, 
base, and walkway using three separate methods.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;   // Identifies the package where this class is stored

public class House 
{

    public static void main(String[] args) 
    {
        // Calls the method that prints the roof of the house
        addRoof();  

        // Calls the method that prints the base/walls of the house
        addBase();

        // Calls the method that prints the walkway under the house
        addWalk();
    }
    
    // Prints the roof section of the house using ASCII characters
    public static void addRoof()
    {
        System.out.println("   /\\");      // Top point of the roof
        System.out.println("  /  \\");     // Upper slanted sides
        System.out.println(" /    \\");    // Lower slanted sides
        System.out.println("/______\\");   // Solid roof base line
    }
    
    // Prints the rectangular base (walls) of the house
    public static void addBase()
    {
        System.out.println("|      |");   // Left and right walls
        System.out.println("|      |");   // Middle wall section
        System.out.println("|      |");   // More wall height
        System.out.println("|______|");   // Bottom of the house
    }
    
    public static void Spaces(int count) {
        // Loops 'count' times to print that many spaces
        for (int i = 0; i < count; i++) {
            System.out.print(" ");        // Prints a single space without a newline
        }
    }
    
    public static void drawBar(int length)
    {
        // Loops from 1 to 'length' to print that many asterisks
        for (int i = 1; i <= length; i++)
        {
            System.out.print("*");        // Prints one star without a newline
        }
        System.out.println();             // Moves to the next line after printing the bar
    }
    
    // Prints the walkway leading from the house
    public static void addWalk()
    {
        Spaces(3);        // Prints spaces to center walkway
        drawBar(2);       // Narrow walkway start
        
        Spaces(3);        // Prints spaces to center walkway
        drawBar(11);      // Wider walkway extension
    }

}

/* Screen Dump

   /\
  /  \
 /    \
/______\
|      |
|      |
|      |
|______|
   **
   ***********

*/

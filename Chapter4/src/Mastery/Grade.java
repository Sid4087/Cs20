/*
Program: Grade.java        Last Date of this Revision: February 26, 2026

Purpose: This program asks the user to enter a percentage grade and then
determines the corresponding letter grade based on standard grading ranges.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        // Create a Scanner object to allow the program to read user input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a percentage grade and store the value as a decimal number
        System.out.print("Enter the percentage: ");
        double percent = input.nextDouble();
        
        // Declare a variable that will later hold the letter grade (A, B, C, D, or F)
        String grade; 
        
        // Determine the correct letter grade by checking which range the percentage falls into.
        // The conditions are checked in order from highest grade to lowest.
        if (percent >= 90) {
            grade = "A";   // 90% and above earns an A
        }
        else if (percent >= 80) {
            grade = "B";   // 80%–89% earns a B
        }
        else if (percent >= 70) {
            grade = "C";   // 70%–79% earns a C
        }
        else if (percent >= 60) {
            grade = "D";   // 60%–69% earns a D
        }
        else {
            grade = "F";   // Anything below 60% earns an F
        }
        
        // Display the final result to the user, showing the letter grade that matches their percentage
        System.out.println("The corresponding letter grade is: " + grade);
    }
}

/*
Sample Output:
Enter the percentage: 75
The corresponding letter grade is: C
*/

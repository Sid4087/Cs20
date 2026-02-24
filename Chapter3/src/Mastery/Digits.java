/*
Program: Digits.java   Last Date of this Revision: February 10, 2026

Purpose: An application that takes the users three digit integer and displays the integers 
hundreds, tens, and ones digits separately.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
*/

package Mastery;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        
        int number = input.nextInt();
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;

        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones-place digit is: " + ones);
    }
}
/*ScreenDump

Enter a three-digit number: 256
The hundreds-place digit is: 2
The tens-place digit is: 5
The ones-place digit is: 6

 */

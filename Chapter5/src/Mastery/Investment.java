/*
Program: Investment.java        Last Date of this Revision: March 5, 2026

Purpose: The purpose of this code is to calculate how many years it will take for a $2,500 
investment to be worth at least $5,000 if compounded annually at 7.5%

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Mastery;

public class Investment 
{

	public static void main(String[] args) 
	{
		double amount = 2500;      // starting investment
        double target = 5000;      // goal amount
        double rate = 0.075;       // 7.5% interest rate
        int years = 0;             // counter for number of years

        // Loop until the investment reaches or exceeds the target
        while (amount < target) {
            amount = amount * (1 + rate);  // compound interest formula
            years++;                       // count each year
        }

        // Output the result
        System.out.println("It will take a $2,500 investment " + years + " years to reach $5000 if compounded annually at 7.5%.");
	}

}
/*ScreenDump

 It will take a $2,500 investment 10 years to reach $5000 if compounded annually at 7.5%.
 
 */


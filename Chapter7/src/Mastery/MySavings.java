/*
Program: MySavings.java   Last Date of this Revision: April 7,2026

Purpose: Create an application that displays a menu of choices for entering pennies,nickels,dimes,and quarters 
into a piggy bank and then prompts the user to make a selection.


Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;

import java.util.Scanner;

public class MySavings
{
    public static void main(String[] args) 
    {
        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Create a PiggyBank object to store coins
        PiggyBank bank = new PiggyBank();

        // Start with a nonzero value so the loop runs
        int choice = -1;
        
        // Loop until the user enters 0
        while (choice != 0)
        {
            // Display menu
            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");
            
            // Read user choice
            choice = input.nextInt();
            
            // Process the user's choice
            switch (choice) 
            {
                case 0:
                    System.out.println("Bye.");
                    break;

                case 1:
                    // Show total amount of money in the piggy bank
                    System.out.printf("\nTotal: $%.2f%n ", bank.getTotal());
                    break;

                case 2:
                    // Add one penny
                    bank.addPenny();
                    break;

                case 3:
                    // Add one nickel
                    bank.addNickel();
                    break;

                case 4:
                    // Add one dime
                    bank.addDime();
                    break;

                case 5:
                    // Add one quarter
                    bank.addQuarter();
                    break;

                case 6:
                    // Remove one coin (largest available)
                    bank.takeOutMoney();
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.print("Invalid choice");
            }
        }
        
        // Close the Scanner
        input.close();
    }
}
/* Screen Dump

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 2

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 3

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 4

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 5

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 6

1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 1

Total: $0.16
 
1. Show total in bank.
2. Add a penny.
3. Add a nickel.
4. Add a dime.
5. Add a quarter.
6. Take money out of bank.
Enter 0 to quit
Enter your choice: 0
Bye.

*/
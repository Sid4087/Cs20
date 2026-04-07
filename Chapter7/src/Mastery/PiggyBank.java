/*
Program: PiggyBank.java   Last Date of this Revision: April 7,2026

Purpose: Stores the number of pennies, nickels, dimes, and quarters 
         in a piggy bank. It provides methods to add coins, remove coins starting with 
         the highest value, and calculate the total amount of money saved.


Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */
package Mastery;

public class PiggyBank 
{
    // Instance variables to store the number of each coin
    private int penny;
    private int nickel;
    private int dime;
    private int quarter;
    
    // Constructor initializes all coin counts to zero
    public PiggyBank()
    {
        penny = 0;
        nickel = 0;
        dime = 0;
        quarter = 0;
    }

    // Add one penny
    public void addPenny() 
    {
        penny++;
    }

    // Add one nickel
    public void addNickel() 
    {
        nickel++;
    }
    
    // Add one dime
    public void addDime() 
    {
        dime++;
    }
    
    // Add one quarter
    public void addQuarter() 
    {
        quarter++;
    }

    // Remove one coin, starting with the largest value
    public void takeOutMoney()
    {
        if (quarter > 0) 
        {
            quarter--;
        }
        else if (dime > 0)
        {
            dime--;
        }
        else if (nickel > 0)
        {
            nickel--;
        }
        else if (penny > 0)
        {
            penny--;
        }
        else
        {
            // No coins left to remove
            System.out.println("You have no more money in the bank.");
        }
    }
    
    // Calculate and return the total value of all coins
    public double getTotal()
    {
        return 
        penny * 0.01 + 
        nickel * 0.05 + 
        dime * 0.10 + 
        quarter * 0.25;
    }
}

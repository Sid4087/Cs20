/*
Program: LunchOrder.java   Last Date of this Revision: April 2,2026

Purpose: Prompts the user for the number of hamburgers, 
salads, french fries, and sodas and then displays the total for the order.

Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */
package Mastery;
import java.util.Scanner;

public class LunchOrder {
    public static void main(String[] args) {

        // Create a Scanner to read user input
        try (Scanner input = new Scanner(System.in)) {

            // Create Food objects representing each menu item
            Food burger = new Food(1.85, 9, 33, 1);
            Food salad = new Food(2.00, 1, 11, 5);
            Food fries = new Food(1.30, 11, 36, 4);
            Food soda = new Food(0.95, 0, 38, 0);

            // Ask for number of hamburgers and display nutrition info
            System.out.print("Enter number of hamburgers: ");
            int burgers = input.nextInt();
            System.out.println("Each hamburger has "
                + burger.getFat() + "g of fat, "
                + burger.getCarbs() + "g of carbs, and "
                + burger.getFiber() + "g of fiber.");

            // Ask for number of salads and display nutrition info
            System.out.print("\nEnter number of salads: ");
            int salads = input.nextInt();
            System.out.println("Each salad has "
                + salad.getFat() + "g of fat, "
                + salad.getCarbs() + "g of carbs, and "
                + salad.getFiber() + "g of fiber.");

            // Ask for number of fries and display nutrition info
            System.out.print("\nEnter number of fries: ");
            int fryCount = input.nextInt();
            System.out.println("French fries have "
                + fries.getFat() + "g of fat, "
                + fries.getCarbs() + "g of carbs, and "
                + fries.getFiber() + "g of fiber.");

            // Ask for number of sodas and display nutrition info
            System.out.print("\nEnter number of sodas: ");
            int sodas = input.nextInt();
            System.out.println("Each soda has "
                + soda.getFat() + "g of fat, "
                + soda.getCarbs() + "g of carbs, and "
                + soda.getFiber() + "g of fiber.");

            // Calculate the total cost of the order
            double totalPrice = burgers * burger.getPrice()
                              + salads * salad.getPrice()
                              + fryCount * fries.getPrice()
                              + sodas * soda.getPrice();

            // Display the final total formatted to two decimal places
            System.out.printf("\nYour order comes to: $%.2f\n", totalPrice);
        }
    }
}


/* Screen Dump

Enter number of hamburgers: 3
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber.

Enter number of salads: 4
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber.

Enter number of fries: 2
French fries have 11.0g of fat, 36.0g of carbs, and 4.0g of fiber.

Enter number of sodas: 5
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber.

Your order comes to: $20.90

*/



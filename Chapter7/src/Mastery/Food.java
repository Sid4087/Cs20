/*
Program: Food.java   Last Date of this Revision: April 2,2026

Purpose: Stores the nutritional information and price of a food item. 
         It keeps track of the item's price, fat, carbohydrates, and fiber content, 
         and provides accessor methods to retrieve each of these values.


Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */
package Mastery;

// The Food class stores nutritional information and price for a food item.
// It provides accessor methods to retrieve each value.
public class Food {

    // Instance variables representing the nutritional values and price
    private double price;   // Cost of the food item
    private double fat;     // Fat content in grams
    private double carbs;   // Carbohydrate content in grams
    private double fiber;   // Fiber content in grams

    // Constructor initializes all nutritional values and price
    public Food(double price, double fat, double carbs, int fiber) 
    {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    // Returns the price of the food item
    public double getPrice() 
    {
        return price;
    }

    // Returns the fat content
    public double getFat() 
    {
        return fat;
    }

    // Returns the carbohydrate content
    public double getCarbs() 
    {
        return carbs;
    }

    // Returns the fiber content
    public double getFiber() 
    {
        return fiber;
    }
}

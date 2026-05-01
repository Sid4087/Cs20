/*
Program: Thermostat.java   Last Date of this Revision: May 1, 2026

Purpose: Create a simulated thermostat that adjusts a set temperature using buttons and
controls LEDs based on how close the room temperature is to the set value.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package Challenge;

import com.phidget22.*;

public class Thermostat 
{
    public static void main(String[] args) throws Exception 
    {

        // Create all Phidget objects: temperature sensor, buttons, and LEDs
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput greenButton = new DigitalInput();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();

        // Open the temperature sensor (connect to hardware)
        temperatureSensor.open(1000);

        // Address and open the green button
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenButton.open(1000);

        // Address and open the red button
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redButton.open(1000);

        // Address and open the green LED
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        greenLED.open(1000);

        // Address and open the red LED
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);

        // Starting set temperature for the thermostat
        int setTemp = 21;

        // Track previous button states so each press counts once
        boolean lastGreen = false;
        boolean lastRed = false;

        // Used to print every 10 seconds
        long lastTime = System.currentTimeMillis();

        while (true) 
        {
            // Read the current temperature from the sensor
            double currentTemp = temperatureSensor.getTemperature();

            // Read button states
            boolean greenState = greenButton.getState();
            boolean redState = redButton.getState();

            // If green button was just pressed → increase set temperature
            if (greenState && !lastGreen) 
            {
                setTemp++;
            }

            // If red button was just pressed → decrease set temperature
            if (redState && !lastRed) 
            {
                setTemp--;
            }

            // Update last button states for next loop
            lastGreen = greenState;
            lastRed = redState;

            // LED logic:
            // If current temperature is within ±2°C of set temperature → green LED ON
            // Otherwise → red LED ON
            if (Math.abs(currentTemp - setTemp) <= 2) 
            {
                greenLED.setState(true);
                redLED.setState(false);
            } 
            else 
            {
                greenLED.setState(false);
                redLED.setState(true);
            }

            // Print temperatures every 10 seconds
            if (System.currentTimeMillis() - lastTime >= 10000) 
            {
                System.out.println("Current Temp: " + currentTemp + " °C\t Set Temp: " + setTemp + " °C");
                lastTime = System.currentTimeMillis();
            }

            // Slow down the loop slightly
            Thread.sleep(100);
        }
    }
}

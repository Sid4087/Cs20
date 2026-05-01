/*
Program: TugOfWar.java   Last Date of this Revision: May 1, 2026

Purpose: Create a two player tug of war game where each button press is counted and the
first player to reach 10 presses wins, followed by LED flashing to show the winner.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package SimplePhidgets;

import com.phidget22.*;

public class TugOfWar {

    public static void main(String[] args) throws Exception {

        // Create
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        // Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        // Open
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        // Track button states
        boolean lastRed = false;
        boolean lastGreen = false;

        // Press counters
        int redCount = 0;
        int greenCount = 0;

        System.out.println("Tug of War started! First to 10 presses wins.");

        while (true) {

            // --- RED BUTTON PRESS DETECTION ---
            boolean redState = redButton.getState();
            if (redState && !lastRed) 
            {
                redCount++;
                System.out.println("Red presses: " + redCount);
            }
            lastRed = redState;

            // --- GREEN BUTTON PRESS DETECTION ---
            boolean greenState = greenButton.getState();
            if (greenState && !lastGreen) 
            {
                greenCount++;
                System.out.println("Green presses: " + greenCount);
            }
            lastGreen = greenState;

            // --- CHECK FOR WINNER ---
            if (redCount >= 10 || greenCount >= 10) 
            {

                boolean redWins = redCount >= 10;

                System.out.println("\nWinner: " + (redWins ? "RED" : "GREEN"));

                // Flash both LEDs once
                redLED.setState(true);
                greenLED.setState(true);
                Thread.sleep(500);

                redLED.setState(false);
                greenLED.setState(false);
                Thread.sleep(500);

                // Flash winner LED 5 times
                for (int i = 0; i < 5; i++) 
                {
                    if (redWins) 
                    {
                        redLED.setState(true);
                    } 
                    else 
                    {
                        greenLED.setState(true);
                    }
                    Thread.sleep(300);

                    if (redWins) 
                    {
                        redLED.setState(false);
                    } 
                    else 
                    {
                        greenLED.setState(false);
                    }
                    Thread.sleep(300);
                }

                break;
            }

            Thread.sleep(50);
        }
    }
}

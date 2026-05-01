/*
Program: SmartPhidgetEvents.java   Last Date of this Revision: May 1, 2026

Purpose: Use Smart Phidget buttons and LEDs with events to run a two player button game
that counts presses, displays scores, and lights LEDs when a player reaches 10.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Events;

//Add Phidgets Library
import com.phidget22.*;

public class ButtonAndLEDEvents {

    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

    static int totalPresses = 0;
    static int redCount = 0;
    static int greenCount = 0;

    //Used only to trigger the break
    static boolean gameOver = false;

    public static void main(String[] args) throws Exception {

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //RED BUTTON EVENT
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {

                if (gameOver) return;

                if (e.getState()) {
                    redCount++;
                    totalPresses++;

                    turnGreenLEDOn = true;

                    System.out.println("Red Button: " + redCount +
                                       "\tGreen Button: " + greenCount +
                                       "\tTotal Presses: " + totalPresses);

                    if (redCount >= 10) {
                        System.out.println("Red player wins");
                        turnRedLEDOn = true;
                        turnGreenLEDOn = true;
                        gameOver = true;
                    }
                } else {
                    turnGreenLEDOn = false;
                }
            }
        });

        //GREEN BUTTON EVENT
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {

                if (gameOver) return;

                if (e.getState()) {
                    greenCount++;
                    totalPresses++;

                    turnRedLEDOn = true;

                    System.out.println("Red Button: " + redCount +
                                       "\tGreen Button: " + greenCount +
                                       "\tTotal Presses: " + totalPresses);

                    if (greenCount >= 10) {
                        System.out.println("Green player wins");
                        turnRedLEDOn = true;
                        turnGreenLEDOn = true;
                        gameOver = true;
                    }
                } else {
                    turnRedLEDOn = false;
                }
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //MAIN LOOP
        while (true) {

            redLED.setState(turnRedLEDOn);
            greenLED.setState(turnGreenLEDOn);

            if (gameOver) break;

            Thread.sleep(150);
        }
    }
}

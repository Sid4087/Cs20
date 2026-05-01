/*
Program: ButtonEvents.java   Last Date of this Revision: May 1, 2026

Purpose: Use Smart Phidget button events to detect when each button is pressed or released
and print the corresponding state to the console.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Events;

//Add Phidgets Library
import com.phidget22.*;

public class ButtonEvents {

    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);

        //Red Button Event | Runs when the button state changes.
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {

                if (e.getState()) {
                    System.out.println("Red button: Pressed");
                } else {
                    System.out.println("Red button: Not pressed");
                }
            }
        });

        //Green Button Event | Runs when the button state changes.
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {

                if (e.getState()) {
                    System.out.println("Green button: Pressed");
                } else {
                    System.out.println("Green button: Not pressed");
                }
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

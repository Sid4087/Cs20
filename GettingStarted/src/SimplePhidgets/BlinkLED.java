/*
Program: BlinkLED.java   Last Date of this Revision: May 1, 2026

Purpose: Blink a Smart Phidget LED on and off three times using a DigitalOutput object.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package SimplePhidgets;

import com.phidget22.DigitalOutput;

public class BlinkLED {

    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create | DigitalOutput object for the LED
        DigitalOutput greenLED = new DigitalOutput();

        //Address | LED connected to Hub Port 4
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect to the physical Phidget
        greenLED.open(1000);

        //Use your Phidgets | Blink LED three times
        for (int i = 0; i < 3; i++) 
        {
            greenLED.setState(true);
            Thread.sleep(2000);
            
            greenLED.setState(false);
            Thread.sleep(1000);
        }
    }
}

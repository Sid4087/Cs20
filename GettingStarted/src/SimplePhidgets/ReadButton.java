/*
Program: ReadButton.java   Last Date of this Revision: May 1, 2026

Purpose: Read the state of a Smart Phidget button and print a message whenever the button
changes between pressed and not pressed.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package SimplePhidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadButton 
{
    public static void main(String[] args) throws Exception
    {
        
        //Create | Here you've created a DigitalInput object for your button. An object represents how you interact with your device. DigitalInput is a class from the Phidgets library that's used to read the state of your button.
        DigitalInput greenButton = new DigitalInput();

        //Address | This tells your program where to find the device you want to work with. Your button is connected to port 0 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
        greenButton.open(1000);
        
        boolean lastState = greenButton.getState();

        while(true)
        {
            boolean currentState = greenButton.getState();

            if(currentState != lastState)
            {
                System.out.println("New state: " + currentState);
                lastState = currentState;   // update so it can detect the next change
            }

            Thread.sleep(50);
        }
    }

        
        
}

  
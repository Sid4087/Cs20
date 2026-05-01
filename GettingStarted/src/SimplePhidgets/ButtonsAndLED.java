/*
Program: ButtonsAndLED.java   Last Date of this Revision: May 1, 2026

Purpose: Use Smart Phidget buttons and LEDs to toggle each LED based on button state and
count the total number of button presses.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package SimplePhidgets;
import com.phidget22.*;

public class ButtonsAndLED
{
	    public static void main(String[] args) throws Exception
	    {

	        //Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address | Address your four objects which lets your program know where to find them.
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(4);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(1);
	        greenLED.setIsHubPortDevice(true);

	        //Open | Connect your program to your physical devices.
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        boolean lastRed = redButton.getState();
	        boolean lastGreen = greenButton.getState();
	        
	        int totalPresses = 0;
	        
	        while(true)
	        {

	            if( redButton.getState())
	            {
	                redLED.setState(false);
	            } 
	            else 
	            {
	                redLED.setState(true);
	            }

	            if(greenButton.getState())
	            {
	            	
	                greenLED.setState(false);
	            } 
	            else 
	            {
	                greenLED.setState(true);
	            }
	            if(redButton.getState() && !lastRed) 
	            {
	                totalPresses++;
	                System.out.println("Total Presses: " + totalPresses);
	            }

	            // COUNT GREEN BUTTON PRESSES
	            if(greenButton.getState() && !lastGreen) 
	            {
	                totalPresses++;
	                System.out.println("Total Presses: " + totalPresses);
	            }

	            // Update last states
	            lastRed = redButton.getState();
	            lastGreen = greenButton.getState();
	            Thread.sleep(150);
	        }
	    }
}
	  


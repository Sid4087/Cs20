/*
Program: HotOrCold.java   Last Date of this Revision: May 1, 2026

Purpose: Use a Smart Phidget TemperatureSensor to check if the room is within a comfortable
20–24°C range and turn LEDs on to indicate whether it is hot or cold.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package SmartPhidgets;

import com.phidget22.*;
public class HotOrCold {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

        //Use your Phidgets | This code will print the temperature every 150ms
        while (true) 
        {
        	double temp = temperatureSensor.getTemperature();
            
        	 if (temp >= 20 && temp <= 24) 
        	 {
                 greenLED.setState(true);
                 redLED.setState(false);
             } 
        	 else 
             {
                 greenLED.setState(false);
                 redLED.setState(true);
             }
            
            System.out.println("Temperature:" + temp + "°C");
            
            Thread.sleep(150);
        }
	}

}

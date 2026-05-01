/*
Program: ClosingPhidgets.java   Last Date of this Revision: May 1, 2026

Purpose: Demonstrate how to open, read from, close, and reopen a Smart Phidget TemperatureSensor.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package Methods;


//Add Phidgets Library
import com.phidget22.*;

public class ClosingPhidgets 
{
    public static void main(String[] args) throws Exception
    {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        temperatureSensor.open(1000);
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
    }
}
  
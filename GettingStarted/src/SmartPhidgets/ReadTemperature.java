/*
Program: ReadTemperature.java   Last Date of this Revision: May 1, 2026

Purpose: Read temperature from a Smart Phidget TemperatureSensor and convert it from Celsius to Fahrenheit for display.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package SmartPhidgets;

//Add Phidgets Library
import com.phidget22.*;

public class ReadTemperature {

    public static void main(String[] args) throws Exception {

        //Create | TemperatureSensor object to gather temperature data
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Connect to the physical Phidget
        temperatureSensor.open(1000);

        //Use your Phidgets | Print temperature every 150ms
        while (true) {

            double C = temperatureSensor.getTemperature();
            double F = (C * 1.8) + 32;

            System.out.printf("Temperature: %.2f°F%n", F);

            Thread.sleep(150);
        }
    }
}

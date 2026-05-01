/*
Program: DataInterval.java   Last Date of this Revision: May 1, 2026

Purpose: control how often a TemperatureSensor sends data by using the Data Interval,
and how to handle that data using an event.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Events;

//Add Phidgets Library
import com.phidget22.*;

public class DataInterval {

    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Temperature Event | Event code runs when data input from the sensor changes.
        //The contained code will only run when the temperature input changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature());
            }
        });

        //Open
        temperatureSensor.open(5000);

        //Set Data Interval | Controls how often the program collects data from your Phidget.
        //Range: 500 ms - 60000 ms.
        temperatureSensor.setDataInterval(60000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

/*
Program: SmartPhidgetEvents.java   Last Date of this Revision: May 1, 2026

Purpose: Use Smart Phidget humidity and temperature sensors with events to display humidity
and report whether the room is warm enough based on a 21°C threshold.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Events;

//Add Phidgets Library
import com.phidget22.*;

public class SmartPhidgetEvents {

    public static void main(String[] args) throws Exception {

        //Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Humidity Event | Event code runs when humidity input changes.
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                System.out.println("Humidity: " + e.getHumidity() + "%RH");
            }
        });

        //Temperature Event | Event code runs when temperature input changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {

                double temp = e.getTemperature();

                if (temp > 21) {
                    System.out.println("Temperature: " + temp + "°C");
                } else {
                    System.out.println("Room is too cold.");
                }
            }
        });

        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

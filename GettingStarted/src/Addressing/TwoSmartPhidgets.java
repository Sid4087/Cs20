/*
Program: TwoSmartPhidgets.java   Last Date of this Revision: May 1, 2026

Purpose: Modify a program so each button prints the temperature from its assigned
Smart Phidget TemperatureSensor when pressed.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Addressing;

//Add Phidgets Library 
import com.phidget22.*;

public class TwoSmartPhidgets {

    public static void main(String[] args) throws Exception {

        //Create 
        TemperatureSensor temperatureSensor0 = new TemperatureSensor();
        TemperatureSensor temperatureSensor1 = new TemperatureSensor();

        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address Buttons
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Address Temperature Sensors
        temperatureSensor0.setHubPort(3);
        temperatureSensor1.setHubPort(2);

        //Red Button Event
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {

                if (e.getState()) {   // button pressed
                    try {
                        System.out.println("Temperature 0: "
                                + temperatureSensor0.getTemperature() + " °C");
                    } catch (PhidgetException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        //Green Button Event
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {

                if (e.getState()) {   // button pressed
                    try {
                        System.out.println("Temperature 1: "
                                + temperatureSensor1.getTemperature() + " °C");
                    } catch (PhidgetException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        //Open 
        temperatureSensor0.open(1000);
        temperatureSensor1.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

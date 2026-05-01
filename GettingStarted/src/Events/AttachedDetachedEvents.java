/*
Program: AttachedDetachedEvents.java   Last Date of this Revision: May 1, 2026

Purpose: detect when Phidget devices are attached or detached, 
and how to respond to those events while also reading temperature data.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/

package Events;

//Add Phidgets Library
import com.phidget22.*;

public class AttachedDetachedEvents {

    public static void main(String[] args) throws Exception {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput led = new DigitalOutput();
        DigitalInput button = new DigitalInput();

        //Address LED + Button
        led.setHubPort(1);
        led.setIsHubPortDevice(true);

        button.setHubPort(0);
        button.setIsHubPortDevice(true);

        //Temperature Data Event
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Attach Events
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach TemperatureSensor");
            }
        });

        led.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach LED");
            }
        });

        button.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach Button");
            }
        });

        //Detach Events
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach TemperatureSensor");
            }
        });

        led.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach LED");
            }
        });

        button.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach Button");
            }
        });

        //Open
        temperatureSensor.open(1000);
        led.open(1000);
        button.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}

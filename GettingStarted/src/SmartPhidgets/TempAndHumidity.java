/*
Program: TempAndHumidity.java   Last Date of this Revision: May 1, 2026

Purpose: Use Smart Phidget humidity and temperature sensors to read both values and print
messages based on whether humidity is above 30% and temperature is above 21°C.

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package SmartPhidgets;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TempAndHumidity {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while(true)
        {
            double humidity = humiditySensor.getHumidity();
            double temp = temperatureSensor.getTemperature();
        	
            if (humidity > 30 && temp > 21)
            {
            	System.out.println("Humidity: " + humidity +" %, Temperature: " + temp + " °C" );
            }
            else if(humidity <= 30 && temp < 21)
            {
            	System.out.println("Humidity is low, Room is to cold" );
            }
            
            else if (humidity <= 30)
            {
            	System.out.println("Humidity is low, Temperature: " + temp + " °C" );
            }
            else
            {
            	System.out.println("Humidity: " + humidity +" %, Room is to cold." );
            }
        	
            Thread.sleep(150);
        }
    }
}
  
/*
Program: LEDBrightness.java   Last Date of this Revision: May 1, 2026

Purpose: Program that dims the LED

Author: Saeid Abdalla
School: CHHS
Course: Computer Science 20
*/
package Methods;


//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness 
{
  //Handle Exceptions 
  public static void main(String[] args) throws Exception
  {

      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);

      for (double brightness = 0.0; brightness <= 1.0; brightness += 0.05) 
      {
          redLED.setDutyCycle(brightness);
          Thread.sleep(100);
      }
      
      for (double brightness = 1.0; brightness >= 0.0; brightness -= 0.05) 
      {
              redLED.setDutyCycle(brightness);
              Thread.sleep(100);
      //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.

      redLED.setDutyCycle(0.0);
      }
      
  }
}
  


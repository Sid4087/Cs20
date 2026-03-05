/*
Program: Volumes.java   Last Date of this Revision: February 25, 2026

Purpose: The purpose of the code is to calculate and output the correct volume of each 
3D shape based on the measurements the user enters.


Author: Saeid Abdalla 
School: CHHS
Course: Computer Science 20
 */

package Mastery;

import java.util.Scanner;

public class Volumes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Rectangular Prism");//Heading
		
		// Input: dimensions of the rectangular prism
		System.out.print("Enter the length: ");
		int length = input.nextInt();
		
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.print("Enter the height: ");
		int height = input.nextInt();
		
		// Process: calculate volume of the rectangular prism
		int prismVolume = length * width * height;
		
		// Output: display the computed volume
		System.out.println("The volume is: " + prismVolume);
		
		
		System.out.println("\nSphere");//Heading
		
		//Input: Sphere dimensions
		System.out.print("Enter the radius: ");
		int radius = input.nextInt();
		
		// Process: compute diameter and then sphere volume 
		// Sphere volume formula using diameter: V = (π × d³) / 6
		int diameter = radius * 2;
		double sphereVolume = (Math.PI * Math.pow(diameter, 3)) / 6.0;
		
		// Output: display sphere volume rounded to 3 decimal places
		System.out.printf("The volume is: %.3f%n", sphereVolume);
		
		
		System.out.println("\nCube");//Heading
		
		// Input: length of one side of the cube
		System.out.print("Enter the length of each side: ");
		int side = input.nextInt();
		
		// Process: calculate cube volume (V = side³)
		int cubeVolume = (int) (Math.pow(side,3));
		
		// Output: display cube volume
		System.out.println("The volume is: " + cubeVolume);
		
		
		
		
	}

}

/*ScreenDump

Rectangular Prism
Enter the length: 3
Enter the width: 4
Enter the height: 5
The volume is: 60

Sphere
Enter the radius: 3
The volume is: 113.097

Cube
Enter the length of each side: 4
The volume is: 64

*/
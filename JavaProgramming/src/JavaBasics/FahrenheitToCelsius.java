//How to convert Fahrenheit to Celsius Program in java
package JavaBasics;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter tempature: ");
		int tempature = s.nextInt();
		double temp = ((tempature - 32) / 1.8);
		System.out.println("Tempature in Celsius:" + temp);
	}
}
/*
How to convert Fahrenheit to Celsius Program in java

-32 /1.8
 
How to convert Celsius to FahrenheitProgram in java

+32 *1.8

*/
//How to add two number Program in java
package JavaBasics;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter First Number");
		int firstnumber = s.nextInt();

		System.out.println("Enter Second Number");
		int secondnumber = s.nextInt();

		// sum
		System.out.println("Sum of Two Number " + (firstnumber + secondnumber));
	}
}

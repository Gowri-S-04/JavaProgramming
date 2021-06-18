//Find Largest no in java Program
package JavaNumbers;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int firstnumber = s.nextInt();
		System.out.println("Enter Second Number");
		int secondnumber = s.nextInt();
		System.out.println("Enter Third Number");
		int thirdnumber = s.nextInt();

		if (firstnumber > secondnumber && firstnumber > thirdnumber) {
			System.out.println("First Number is the GreaterNumber");
		} else if (secondnumber > firstnumber && secondnumber > thirdnumber) {
			System.out.println("Second Number is the GreaterNumber");
		} else if (thirdnumber > firstnumber && thirdnumber > secondnumber) {
			System.out.println("Third Number is the GreaterNumber");
		}
	}
}

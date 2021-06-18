package JavaNumbers;

import java.util.Scanner;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = s.nextInt();
		int count = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Number of Digits in a Number: " + count);
	}
}

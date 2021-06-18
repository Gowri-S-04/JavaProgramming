package JavaNumbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = s.nextInt();
		int reverse = 0;
		int n = number;

		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		if (n == reverse) {
			System.out.println("Given Number is Palindrome");
		} else {
			System.out.println("Given Number is Not A Palindrome");
		}
	}
}

// A Palindrome number is a number that remains the same when its digits are reversed

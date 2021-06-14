package JavaStrings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = s.next();
		String reverse = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of a String: " + reverse);

		if (str.equals(reverse)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a Palindrome String");
		}
	}
}

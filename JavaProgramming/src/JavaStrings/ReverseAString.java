package JavaStrings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = s.next();
		String reverse = "";

		// Using String ( + ) concatenation operator
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of a String: " + reverse);

		// Using Character Array
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + a[i];
		}
		System.out.println("Reverse of a String: " + reverse);

		// Using StringBuffer Class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse of a String: " + sb.reverse());
	}
}

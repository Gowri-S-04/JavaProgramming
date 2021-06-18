package JavaNumbers;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = s.nextInt();
		System.out.println("Enter Second Number: ");
		int b = s.nextInt();
		System.out.println("Before Swapping: " + "FirstNumber: " + a + " SecondNumber: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping: " + "FirstNumber: " + b + " SecondNumber: " + b);
	}
}

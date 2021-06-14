package JavaNumbers;

//Write a Java program to check a number is even or odd.
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = s.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

	}
}

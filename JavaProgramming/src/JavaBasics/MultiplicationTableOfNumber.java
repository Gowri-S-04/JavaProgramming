package JavaBasics;

//Write a program in Java to display the multiplication table of a number using for loop.
import java.util.Scanner;

public class MultiplicationTableOfNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = s.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "*" + i + "= " + (number * i));
		}
	}
}

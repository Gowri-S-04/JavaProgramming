package JavaNumbers;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = s.nextInt();
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse of given number is : " + rev);
	}
}
/*

A number divided by 10 using modulus operator returns last digit 
A number divided by 10 using division operator removes last digit and returns remaining digit


n=123

rev= 0*10 + 123%10  0+3
n= 123/10= 12

rev= 3*10 + 12%10  30+2
n= 12/10= 1

rev= 32*10 + 1%10  320+1=321
n= 1/10= 1

 */
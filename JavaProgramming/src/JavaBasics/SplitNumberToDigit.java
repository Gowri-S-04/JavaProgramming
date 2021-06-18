package JavaBasics;

import java.util.Scanner;

//Write a java program to split number into digits.
public class SplitNumberToDigit {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n=s.nextInt();	
		while(n>0) //1234>0
		{
			int digit=n%10; // 1234%10 = 4(Remainder)
			System.out.print(" "+ digit);
			n=n/10; // 1234/10 = 123(Quotient)
		}
	}
}


//Write a Java program to check whether number is negative, zero, or positive.
package JavaBasics;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int number=s.nextInt();
		
		// -5 -4 -3 -2 -1 0 1 2 3 4 5 
		
		//If number>0 the number is positive.
		if(number>0)
		{
			System.out.println("Postive");
		}
		//If number<0 the number is negative.
		else if(number<0)
		{
			System.out.println("Negative");
		}
		//If a number is neither positive nor negative, the number is equal to 0.
		else 
		{
			System.out.println("Zero");
		}
	}
}


//Write a program will show if the person is eligible to vote. 

package JavaBasics;
import java.util.Scanner;
public class EligibileToVote {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}

	}

}

package JavaBasics;
//Write a program in Java to display the first 10 natural numbers in descending order using do..while loop.

public class NaturalNumbersDescending {

	public static void main(String[] args) {
		
		int i=10;
		do
		{
			System.out.println(i);
			i--;	
		}while(i>=1);
	}
}

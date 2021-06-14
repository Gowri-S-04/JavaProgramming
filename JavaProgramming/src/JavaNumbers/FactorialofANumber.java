package JavaNumbers;

import java.util.Scanner;

public class FactorialofANumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = s.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factoiral of given number is: "+ factorial);
	}

}

/*

Factorial

5!= 5* 4* 3* 2* 1 = 120
5!= 1* 2* 3* 4* 5 = 120

n=5 i=1 factorial = 1;

factorial = factorial * i;

1*1 =1
1*2 =2
2*3 =6
6*4 =24
24*5 =120

*/
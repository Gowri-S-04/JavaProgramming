package JavaArray;

public class SumOfArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4 };
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[i] + sum; // 0+1=1 3+1=4 5+4=9 9+6=15
		}
		System.out.println("Sum of Array: " + sum);
	}
}
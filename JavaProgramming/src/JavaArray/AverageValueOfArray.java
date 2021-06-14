package JavaArray;

public class AverageValueOfArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		double average = 0d;
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[i] + sum;
		}
		average = sum / numbers.length;
		System.out.println("Average Value of an Array: " + average);
	}
}

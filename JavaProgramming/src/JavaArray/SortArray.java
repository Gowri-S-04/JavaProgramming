package JavaArray;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] num_arr = { 12, 11, 13, 14 };
		String[] str_arr = { "Java", "Python", "Ruby", "Perl" };
		System.out.println("Original Numeric Array: " + (Arrays.toString(num_arr)));
		System.out.println("Original String Array: " + (Arrays.toString(str_arr)));
		Arrays.sort(num_arr);
		System.out.println("Sorted a Numeric Array: " + Arrays.toString(num_arr));
		Arrays.sort(str_arr);
		System.out.println("Sorted a String Array: " + Arrays.toString(str_arr));
	}
}

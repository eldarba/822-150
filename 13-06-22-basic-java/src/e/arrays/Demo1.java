package e.arrays;

import java.util.Arrays;

public class Demo1 {

	/*
	 * create an array with 25 random numbers in the range 0 - 9. print all
	 * elements.
	 */
	public static void main(String[] args) {

		// create an array
		int[] arr = new int[25];

		// populate the array
		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 10);
			arr[i] = r;
		}

		// convert the array to String and print
		System.out.println(Arrays.toString(arr));

	}

}

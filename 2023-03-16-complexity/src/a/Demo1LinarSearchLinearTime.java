package a;

import java.util.Arrays;

public class Demo1LinarSearchLinearTime {

	// liner search O(n)

	/**
	 * return the index of the specified value or -1 if not found
	 * 
	 * @param arr the array of n inputs
	 * @param val - the value to look for
	 * @return the index for the value
	 */
	static int liniarSearch(int[] arr, int val) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			c++;
			if (arr[i] == val) {
				System.out.println("elementary steps: " + c);
				return arr[i];
			}
		}
		System.out.println("elementary steps: " + c);
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100_000);
		}
		// no need to sort
		Arrays.sort(arr);
		int index = liniarSearch(arr, 100);
		System.out.println(index);
	}

}

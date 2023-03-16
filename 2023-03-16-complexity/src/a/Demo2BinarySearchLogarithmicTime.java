package a;

import java.util.Arrays;

public class Demo2BinarySearchLogarithmicTime {

	// binary search O(log n)

	/**
	 * return the index of the specified value or -1 if not found
	 * 
	 * @param arr the array of n inputs - must be sorted
	 * @param val - the value to look for
	 * @return the index for the value
	 */
	static int binarySearch(int[] arr, int val) {
		int low = 0;
		int high = arr.length - 1;
		int c = 0;
		while (low <= high) {
			c++;
			int mid = (low + high) / 2;
			int midVal = arr[mid];

			if (midVal < val) {
				low = mid + 1;
			} else if (midVal > val) {
				high = mid - 1;
			} else {
				System.out.println("elementary steps: " + c);
				return mid; // the right index for val
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
		// must be sorted
		Arrays.sort(arr);
		int index = binarySearch(arr, 100);
		System.out.println(index);
	}

}

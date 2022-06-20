package a.arr.dimentions;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		// create the first dimension
		int[][] arr = new int[3][];
		// create the second dimension
		arr[0] = new int[] { 0, 0, 0 };
		arr[1] = new int[] { 0, 0, 0, 100, 0 };
		arr[2] = new int[] { 30, 0};
		// print
		System.out.println(Arrays.deepToString(arr));

	}

}

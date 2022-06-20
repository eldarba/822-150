package a.arr.dimentions;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		// create the first dimension
		int[][] arr = new int[3][];
		// create the second dimension
		arr[0] = new int[3];
		arr[1] = new int[5];
		arr[2] = new int[2];
		// populate
		arr[1][3] = 100;
		arr[2][0] = 30;
		// print
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println("==============");
		// deep to string - for multi dimensional arrays
		System.out.println(Arrays.deepToString(arr));

	}

}

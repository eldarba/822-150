package a.arr.dimentions;

import java.util.Arrays;

public class Demo5 {

	public static void main(String[] args) {
		{
			// create the first dimension
			int[][] arr = { { 0, 0, 0 }, { 0, 0, 0, 100, 0 }, { 30, 0 } };
			// print
			System.out.println(Arrays.deepToString(arr));
		}

		{
			// another way
			int[][] arr = { new int[3], { 0, 0, 0, 100, 0 }, { 30, 0 } };
			System.out.println(Arrays.deepToString(arr));
		}
	}

}

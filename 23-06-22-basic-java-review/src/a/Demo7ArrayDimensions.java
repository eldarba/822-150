package a;

import java.util.Arrays;

public class Demo7ArrayDimensions {

	public static void main(String[] args) {

		{ // 2 dimensional array - static initialization

			int[][] arr = { { 1, 2, 3 }, { 2, 4, 6, 8, 0 }, { 1, 1 } };

			for (int[] currArr : arr) {
				System.out.println(currArr);
				for (int x : currArr) {
					System.out.println(x);
				}
			}

		}
		
		System.out.println("========================");
		
		{ // 2 dimensional array - dynamic initialization
			int[][] arr = new int[3][];
			arr[0] = new int[3];
			arr[0][0] = 1;
			arr[0][1] = 2;
			arr[0][2] = 3;
			arr[1] = new int[5];
			arr[1][0] = 2;
			arr[1][1] = 4;
			arr[1][2] = 6;
			arr[1][3] = 8;
			arr[1][4] = 0;
			arr[2] = new int[2];
			arr[2][0] = 1;
			arr[2][1] = 1;
			
			System.out.println(Arrays.deepToString(arr));
		}
	}

}

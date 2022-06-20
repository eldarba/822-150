package lab10;

import java.util.Arrays;

public class Tar02Method {

	public static void main(String[] args) {
		// create an array of random length
		int length = (int) (Math.random() * 6) + 10;
		int[] arr = new int[length];
		// populate with random values
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}

		System.out.println(Arrays.toString(arr));
		arr = eliminateDuplicates(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] eliminateDuplicates(int[] arr) {
		int[] arrTemp = new int[arr.length];
		int index = 0;
		lbl: for (int i = 0; i < arr.length; i++) {
			int candidate = arr[i];
			for (int j = 0; j < index; j++) {
				if (candidate == arrTemp[j]) {
					continue lbl;
				}
			}
			arrTemp[index++] = candidate;
		}

		int[] arrShort = new int[index];
		System.arraycopy(arrTemp, 0, arrShort, 0, index);
		return arrShort;

	}

}

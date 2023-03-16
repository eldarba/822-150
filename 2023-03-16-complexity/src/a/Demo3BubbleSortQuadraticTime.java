package a;

import java.util.Arrays;

public class Demo3BubbleSortQuadraticTime {

	// bubble sort O(n^2)

	static void bubbleSort(int[] arr) {
		long c = 0;
		for (int i = 0; i < arr.length; i++) {
			c++;
			for (int j = 1; j < (arr.length - i); j++) {
				c++;
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("elementary steps: " + c);
	}

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1000);
		}
		bubbleSort(arr);
	}

}

package a;

public class Demo6ArraysIteration {

	public static void main(String[] args) {

		int[] arr = { 4, 6, 8, 2, 4, 6, 1 };

		// iterate the array with for loop
		for (int i = 0; i < arr.length; i++) {
			int currentElement = arr[i];
			System.out.println(currentElement);
		}
		System.out.println("===============");

		// iterate the array with while loop
		int i = 0;
		while (i < arr.length) {
			int currentElement = arr[i];
			System.out.println(currentElement);
			i++;
		}
		System.out.println("===============");

		// iterate the array with for-each loop
		for (int currentElement : arr) {
			System.out.println(currentElement);
		}
		
	}

}

package a;

import java.util.Arrays;

public class Demo5Arrays {

	public static void main(String[] args) {
		{

			// create an array
			char[] arr = new char[3];
			// populate an array
			arr[0] = 'A';
			arr[1] = 'B';
			arr[2] = 'C';
			// access array elements (print)
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
		}

		{
			int[] arr = { 23, 65, 17, 68 };
			// access array elements (print)
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
		}
		
		{
			String[] names = {"David", "Lea", "Moshe"};
			System.out.println(Arrays.toString(names));
		}

	}

}

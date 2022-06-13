package e.arrays;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		{ // dynamic initialization
			String[] names = new String[5];
			names[0] = "Dan";
			names[1] = "Ran";
			names[2] = "Edna";
			names[3] = "Michal";
			names[4] = "Ofir";
			System.out.println(Arrays.toString(names));
		}

		{ // static initialization
			String[] names = { "Dan", "Ran", "Edna", "Michal", "Ofir" };
			System.out.println(Arrays.toString(names));

			int[] arr = { 3, 7, 5, 2 };
			System.out.println(Arrays.toString(arr));
		}

	}

}

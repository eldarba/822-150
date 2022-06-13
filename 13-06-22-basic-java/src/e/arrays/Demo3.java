package e.arrays;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		// pool of names
		String[] names = { "Dan", "Ran", "Edna", "Michal", "Ofir" };

		// array of random names from the pool
		String[] allNames = new String[100];

		// populate names
		for (int i = 0; i < allNames.length; i++) {
			// choose random name index
			int randomIndex = (int) (Math.random() * names.length);
			// add the random name to the big array
			allNames[i] = names[randomIndex];
		}

		System.out.println(Arrays.toString(allNames));

	}

}

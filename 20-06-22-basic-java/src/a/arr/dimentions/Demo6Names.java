package a.arr.dimentions;

import java.util.Arrays;

public class Demo6Names {

	public static void main(String[] args) {

		String[] boys = { "Liam", "Noah", "Oliver", "Elijah", "James", "William", "Benjamin", "Lucas", "Henry",
				"Theodore" };
		String[] girls = { "Olivia", "Emma", "Charlotte", "Amelia", "Ava", "Sophia", "Isabella", "Mia", "Evelyn",
				"Harper" };
		// create a matrix of names
		String[][] names = new String[3][5];
		
		// populate with random names
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				if (Math.random() < 0.5) {
					names[i][j] = boys[(int) (Math.random() * boys.length)];
				} else {
					names[i][j] = girls[(int) (Math.random() * girls.length)];
				}
			}
		}
		
		// print
		for (int i = 0; i < names.length; i++) {
			System.out.println(Arrays.toString(names[i]));
		}

	}

}

package a.arr.dimentions;

import java.util.Arrays;

public class YesPlanet {

	// field
	static char[][] mat = new char[5][10];

	// main - application bootstrap
	public static void main(String[] args) {
		// method invocation (call)
		init();
		print();
		admit(1, 1);
		admit(5, 10);
		print();
	}

	// method definition
	static void admit(int row, int seat) {
		row--;
		seat--;
		if (mat[row][seat] == 'O') {
			mat[row][seat] = 'X';
		} else {
			System.out.println("seat is taken");
		}
	}

	static void init() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = 'O';
			}
		}
	}

	static void print() {
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		System.out.println("========================");
	}

}

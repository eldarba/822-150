package a.arr.dimentions;

import java.util.Arrays;

public class YesPlanet {
	
	static char[][] mat = new char[5][10];
	
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
	}

}

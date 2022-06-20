package a.arr.dimentions;

import java.util.Arrays;
import java.util.Scanner;

public class YesPlanetInteractive {

	// field
	static char[][] mat = new char[5][10];
	static Scanner sc = new Scanner(System.in);

	// main - application bootstrap
	public static void main(String[] args) {
		init();
		lbl: while(true) {
			showMenu();
			String input = sc.nextLine();
			switch (input) {
			case "p":
				System.out.println("print");
				print();
				break;
			case "a":
				System.out.println("admit");
				System.out.print("enter row number: ");
				int row = sc.nextInt();
				System.out.print("enter seat number: ");
				int seat = sc.nextInt();
				admit(row, seat);
				break;
			case "x":
				System.out.println("exit");
				sc.close();
				break lbl;

			default:
				System.out.println(input + " is not a supported action");
				break;
			}
			
		}
		
		System.out.println("BYE!!!");
		
		
	}

	// method definition
	static void showMenu() {
		System.out.println("\nYes Planet Menu ===============");
		System.out.println("p .............. print");
		System.out.println("a .............. admit");
		System.out.println("x .............. exit");
		System.out.print("Enter your choice: ");
	}
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
		System.out.println("==============================");
	}

}

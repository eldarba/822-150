package c;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		int password = 123;
		Scanner sc = new Scanner(System.in);
		int input;

		do {
			System.out.print("enter password: ");
			input = sc.nextInt();
		} while (input != password);

		sc.close();
		System.out.println("you are logged in");

	}

}

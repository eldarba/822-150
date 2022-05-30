package c;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int password = 123;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter password: ");
		int input = sc.nextInt();

		while (input != password) {
			System.out.print("wrong password enter again: ");
			input = sc.nextInt();
		}
		
		sc.close();
		System.out.println("you are logged in");

	}

}

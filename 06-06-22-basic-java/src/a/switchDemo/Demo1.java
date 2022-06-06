package a.switchDemo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number [2 4 6]");
		int x = sc.nextInt();

		switch (x) {
		case 2:
			System.out.println(" x is 2");
			break;
		case 4:
			System.out.println(" x is 4");
			break;
		case 6:
			System.out.println(" x is 6");
			break;
		default:
			System.out.println("x is something else");
		}

		sc.close();

	}

}

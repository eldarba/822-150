package a.switchDemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter grade [0 - 10]");
		int grade = sc.nextInt();

		switch (grade) {
		case 0, 1, 2, 3, 4:
			System.out.println("fail");
			break;
		case 5, 6, 7:
			System.out.println("pass");
			break;
		case 8, 9, 10:
			System.out.println("good");
			break;
			default:
				System.out.println(grade + " is not a valid grade");
		}

		sc.close();

	}

}

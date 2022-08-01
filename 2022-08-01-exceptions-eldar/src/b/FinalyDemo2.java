package b;

import java.util.Scanner;

public class FinalyDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter number: ");
			int number = sc.nextInt();
			System.out.println(number);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("closing scanner:");
			sc.close();
		}

	}

}

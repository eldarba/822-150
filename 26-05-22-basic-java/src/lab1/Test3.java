package lab1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		/*
		 * Create a class that defines 2 random numbers
		 * 
		 * and prints the bigger value
		 */

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int max = a > b ? a : b;
		System.out.println(a + ", " + b);
		System.out.println("max: " + max);

		// ====================================
		Scanner sc = new Scanner(System.in);
		System.out.print("enter user name: ");
		String user = sc.nextLine();
		System.out.println("Hello " + (user.equals("") ? "Guest" : user));
		sc.close();

	}

}

package a;

import java.util.Scanner;

public class InputDemo4 {
	// get 2 numbers from user and print the sum
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("enter first num: ");
		a = sc.nextInt();

		System.out.print("enter second num: ");
		b = sc.nextInt();
		
		int sum = a + b;
		System.out.println(sum);
		
		sc.close();

	}

}

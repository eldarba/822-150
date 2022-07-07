package a.task.flow.control;

import java.util.Scanner;

public class Demo1PrimeNumber {

	/*
	 * input a number and print if it is prime or not
	 */
	public static void main(String[] args) {

		// 3259 - primary
		// 954529 - composite
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");

		int n = sc.nextInt();
		sc.close();

		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {
			// divide the number by m starts at 2 and ends at n / 2
			for (int m = 2; m <= n / 2; m++) {
				System.out.println(m);
				if (n % m == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println("Primary");
		} else {
			System.out.println("NOT Primary");
		}

	}

}

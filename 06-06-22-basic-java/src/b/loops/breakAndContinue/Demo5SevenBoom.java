package b.loops.breakAndContinue;

import java.util.Scanner;

public class Demo5SevenBoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st nuber: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd nuber: ");
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		System.out.println(a + " - " + b);

		lbl: for (int i = a; i <= b; i++) {
			// check if divide by 7
			if (i % 7 == 0) {
				System.out.println("BOOM");
				continue;
			}
			// check if contains digit 7
			int n = i;
			while (n != 0) {
				if (n % 10 == 7) {
					System.out.println("BOOM");
					continue lbl;
				}
				n = n / 10;
			}
			// if we are here we can print the number
			System.out.println(i);
		}

	}

}

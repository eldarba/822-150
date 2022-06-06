package a.exam;

import java.util.Scanner;

public class Tar3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b = sc.nextInt();
		sc.close();

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		System.out.println("a=" + a + ", b=" + b);

		for (int i = a; i <= b; i++) {
			if (i % 7 == 0) {
				System.out.println("boom");
			} else {
				boolean boom = false;
				int n = i;
				while (n != 0) {
					if (n % 10 == 7) {
						System.out.println("boom");
						boom = true;
						n = 0;
					} else {
						n = n / 10;
					}
				}

//				if (boom == false) {
				if (!boom) {
					System.out.println(i);
				}
			}
		}
	}

}

package b.loops.breakAndContinue;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
//			int r = (int) (Math.random() * 101);
			System.out.print("enter number: ");
			int r = sc.nextInt();
			System.out.println(i + " - " + r);
			if (r == sum) {
				System.out.println("found");
				break;
			}
			sum += r;
		}
		
		sc.close();

	}

}

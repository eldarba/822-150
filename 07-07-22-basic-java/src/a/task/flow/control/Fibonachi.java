package a.task.flow.control;

import java.util.Scanner;

public class Fibonachi {

	public static void main(String[] args) {

		// print 10 first members in Fibonaci set
		// input a number and print Fibonaci set from 1 to that input

		// input an index and print Fibonaci member at that index
		Scanner sc = new Scanner(System.in);
		System.out.print("enter index: ");
		int index = sc.nextInt();
		sc.close();


		int f1 = 1;
		int f2 = 1;

		for (int i = 3; i <= index; i++) {
			System.out.println("x");
			int t = f2;
			f2 = f1 + f2;
			f1 = t;
		}
		
		System.out.println(f2);
		

	}

}

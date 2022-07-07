package a.task.flow.control;

import java.util.Scanner;

public class ScannerDemo {

	/*
	 * input a number and print if it is prime or not
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner("aaa bbb ccc\nhello world 43");
		System.out.println(sc.next());
		System.out.println(sc.nextLine());
		System.out.println(sc.next());
		System.out.println(sc.next());
		int x = sc.nextInt();
		System.out.println(x);

	}

}

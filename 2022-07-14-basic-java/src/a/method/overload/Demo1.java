package a.method.overload;

import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {

		m1("hello");
		m1(10);
		m1(3, 9);
		
		System.out.println(new Date());

	}

	public static void m1(String message) {
		System.out.println(message);
	}

	public static void m1(int value) {
		System.out.println("your value is: " + value);
	}

	public static void m1(int val1, int val2) {
		System.out.println("your values are: " + val1 + ", " + val2);
	}

}

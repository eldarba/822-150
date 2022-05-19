package a;

import java.util.Scanner;

public class InputDemo2 {

	public static void main(String[] args) {
		
		// scanner is an object for input
		Scanner sc = new Scanner("aaa bbb ccc");
		
		String token = sc.next();
		System.out.println(token);
		
		token = sc.next();
		System.out.println(token);

		token = sc.next();
		System.out.println(token);
		
		sc.close();
		

	}

}

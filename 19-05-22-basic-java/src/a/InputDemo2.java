package a;

import java.util.Scanner;

public class InputDemo2 {

	public static void main(String[] args) {
		
		// scanner is an object for input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1st token"); // prompt user for input
		String token = sc.next(); // get the input from user
		System.out.println(token); // print the input
		
		System.out.println("enter 2nd token");
		token = sc.next();
		System.out.println(token);

		System.out.println("enter 3rd token");
		token = sc.next();
		System.out.println(token);
		
		sc.close();
		

	}

}

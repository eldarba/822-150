package a;

import java.util.Scanner;

public class InputDemo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your requset:");
		String request = sc.nextLine(); // get a full line
		System.out.println("your request was:");
		System.out.println(request);
		sc.close();

	}

}

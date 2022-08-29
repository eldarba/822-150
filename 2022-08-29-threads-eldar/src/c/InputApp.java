package c;

import java.util.Scanner;

public class InputApp {

	public static void main(String[] args) {
		
		Thread snooze = new SnoozeThread();
		snooze.start();
		
		
		try(Scanner sc = new Scanner(System.in);){
			System.out.print("enter name: ");
			String name = sc.nextLine();
			System.out.println("Hello " + name);
		}

	}

}

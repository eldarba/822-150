package c;

import java.util.Scanner;

public class ARM {

	// Auto Resource Management
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner("aaa bbb ccc");){
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.next());
		}
		// sc.close(); // ARM will close this

	}

}

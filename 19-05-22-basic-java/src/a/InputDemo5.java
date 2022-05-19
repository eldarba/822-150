package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputDemo5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("data.txt");
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();

	}

}

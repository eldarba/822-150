package a.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo3 {

	public static void main(String[] args) {

		File file = new File("temp/eldar/letter.txt");

		boolean append = true;
		try (PrintWriter out = new PrintWriter(new FileWriter(file, append));) {
			out.println("Hello file IO");
			out.println(5);
			out.println(Math.random());
			out.println(Math.PI);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("text written to " + file);

	}

}

package a.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		File file = new File("temp/eldar/letter.txt");

		boolean append = true; // if append is set to true - data will be added to the existing data in the file
		try (FileWriter out = new FileWriter(file, append);) {
			out.write("Hello file IO\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("text written to " + file);

	}

}

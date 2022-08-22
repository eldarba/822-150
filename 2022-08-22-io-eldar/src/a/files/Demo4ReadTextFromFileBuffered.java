package a.files;

import java.io.FileReader;
import java.io.IOException;

public class Demo4ReadTextFromFileBuffered {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("temp/eldar/letter.txt");) {
			int c = in.read();
			System.out.println(c);
			System.out.println((char)c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

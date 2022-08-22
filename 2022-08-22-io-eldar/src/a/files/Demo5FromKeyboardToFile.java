package a.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Demo5FromKeyboardToFile {

	/*
	 * read lines of text from keyboard and write to file. when user enters 'exit' -
	 * stop
	 */
	public static void main(String[] args) {

		try (
				// read from keyboard object
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

				PrintWriter out = new PrintWriter(new File("temp/eldar/letter.txt"));

		) {

			System.out.println("enter lines, enter \"exit\" to quit");
			String line = in.readLine(); // input first line
			while (!line.equals("exit")) {
				out.println(line); // output line
				line = in.readLine(); // input next line
			}
			
			System.out.println("bye!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

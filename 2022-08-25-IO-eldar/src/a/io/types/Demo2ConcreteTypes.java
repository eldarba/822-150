package a.io.types;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo2ConcreteTypes {

	public static void main(String[] args) throws IOException {

		// STREAMS ARE DATA FLOWING INTO THE PROGRAM OR OUT OF IT

		// to read or write to streams we need the proper objects

		// CONCRETE TYPES

		{ // read text from file with buffer
			// 1. BufferedReader
			// 2. FileReader
			BufferedReader in = new BufferedReader(new FileReader("files/letter"));
			String line = in.readLine();
			System.out.println(line);
			in.close();

		}
		
		{ // write text to file with buffer
			// 1. BufferedWriter
			// 2. FileWriter
			BufferedWriter out = new BufferedWriter(new FileWriter("files/letter", true));
			out.write("this is a line of text buffered\n");
			out.close();
		}

		{ // write text to file with printer
			// 1. PrintWriter
			// 2. FileWriter
			PrintWriter out = new PrintWriter(new FileWriter("files/letter", true));
			out.println("this is a line of text printer");
			out.println(24);
			out.println(6.78);
			out.println(true);
			out.close();
		}
		

	}

}

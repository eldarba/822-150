package a.io.types;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Demo1AbstractTypes {

	public static void main(String[] args) throws IOException {
		
		// STREAMS ARE DATA FLOWING INTO THE PROGRAM OR OUT OF IT
		
		
		// to read or write to streams we need the proper objects
		
		// ABSTRACT SUPER TYPES
		
		// character streams - text
		{
			// input
			Reader in = null;
			// Reads a single character
			in.read();
			
			// output
			Writer out = null;
			// Writes a single character.
			out.write('A');
		}

		// byte streams - any binary data
		{
			// input
			InputStream in = null;
			// Reads the next byte of data from the input stream.
			in.read();
			
			// output
			OutputStream out = null;
			// Writes the specified byte to this output stream.
			out.write('A');
		}
		

	}

}

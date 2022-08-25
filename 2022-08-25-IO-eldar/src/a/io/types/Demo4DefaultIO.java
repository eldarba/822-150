package a.io.types;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Demo4DefaultIO {

	public static void main(String[] args) {
		
		// the default io objects are:
		
		 PrintStream out = System.out;
		 PrintStream err = System.err;
		 InputStream in = System.in;
		 
		 // common uses of default io
		 System.out.println("standard output");
		 System.err.println("errors");
		 Scanner sc = new Scanner(System.in);

	}

}

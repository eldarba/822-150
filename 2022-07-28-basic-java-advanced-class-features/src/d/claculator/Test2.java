package d.claculator;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {
		
		// this code will throw an exception and there is no warning
		int[] arr = new int[-3];
		
		// this code might throw an exception and there is warning
		File file = new File("c:/temp");
		// file.createNewFile();
		
		
		

	}

}

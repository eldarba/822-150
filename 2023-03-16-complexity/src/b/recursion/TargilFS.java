package b.recursion;

import java.io.File;

public class TargilFS {

	static void printFS(String path) {
		// 1. create a File object from the path
		File file = new File(path);
		// 2. check for base case - the path points to a file (not a directory)
		if (file.isFile()) {
			System.out.println("\t" + file);
		} else {
			// 3. if this is a directory get an array of its content
			System.out.println(file);
			File[] files = file.listFiles();
			// 4. send each file in the array to this same method - recursion
			for (File currFile : files) {
				printFS(currFile.getPath());
			}
			System.out.println("==============");

		}
	}

	public static void main(String[] args) {
		String path = "C:\\programming\\html";
		printFS(path);
	}

}

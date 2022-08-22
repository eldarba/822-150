package a.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6CopyBinaryFile {

	public static void main(String[] args) {

		File fileSrc = new File("temp/eldar/butterfly.jpg");
		File fileDst = new File("temp/eldar/butterflyCopy.jpg");

		try (

				BufferedInputStream in = new BufferedInputStream(new FileInputStream(fileSrc));

				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileDst));

		) {

			int size = in.available();
			System.out.println("file size: " + size);

			int b = in.read(); // read the first byte from file
			while (b != -1) {
				out.write(b); // write the byte to file
				b = in.read(); // read the next byte from file
				System.out.println("---");
			}

			System.out.println("copied from " + fileSrc);
			System.out.println("to " + fileDst);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package b.io.objects;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectToFile {

	public static void main(String[] args) {

		File file = new File("files/user.obj");
		// 1. ObjectOutputStream - to write objects to streams
		// 2. BufferedOutputStream - add buffer
		// 3. FileOutputStream - the destination is a file (node stream)
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			User user = new User(111, "Lea Aharoni", "lea", "pass123", "lea@gmail.com", 4456996898957458L);
			out.writeObject(user);
			System.out.println("user written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

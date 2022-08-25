package b.io.objects;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectFromFile {

	public static void main(String[] args) {

		File file = new File("files/user.obj");
		// 1. ObjectInputStream - to read objects from streams
		// 2. BufferedInputStream - add buffer
		// 3. FileInputStream - the source is a file (node stream)
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			User user = (User) in.readObject();
			System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}

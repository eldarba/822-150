package b.io.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFromFile {

	public static void main(String[] args) {

		File file = new File("files/info.data");
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

			// read data from file
			byte age = in.readByte();
			int id = in.readInt();
			double price = in.readDouble();
			boolean isUserActive = in.readBoolean();
			String userName = in.readUTF();
			
			System.out.println(age);
			System.out.println(id);
			System.out.println(price);
			System.out.println(isUserActive);
			System.out.println(userName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

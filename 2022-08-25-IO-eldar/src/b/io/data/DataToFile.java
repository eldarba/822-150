package b.io.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataToFile {

	public static void main(String[] args) {

		// data is Java primitives and String
		byte age = 50;
		int id = 98659874;
		double price = 10.85;
		boolean isUserActive = true;
		String userName = "Avi Levi";

		// save data to file
		File file = new File("files/info.data");
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));) {
			out.writeByte(age);
			out.writeInt(id);
			out.writeDouble(price);
			out.writeBoolean(isUserActive);
			out.writeUTF(userName);
			System.out.println("data written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

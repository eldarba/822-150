package b;

import java.util.Scanner;

public class FinalyDemo3 {

	public static void main(String[] args) {

		// try with resources - will accept objects that implements AutoClosable interface
		// and will close it at the end of try block
		try (

				Scanner sc = new Scanner(System.in);

				MyClosable c = new MyClosable()

		) {
			System.out.print("enter number: ");
			int number = sc.nextInt();
			System.out.println(number);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class MyClosable implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("--- closing ---");

	}

}

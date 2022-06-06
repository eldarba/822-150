package c;

public class Demo8 {

	/*
	 * draw a line of 10 * characters using a for loop
	 */
	public static void main(String[] args) {

		for (int c = 0; c < 3; c++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println(); // new line
		}

		System.out.println("END");

	}

}

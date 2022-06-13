package c.lab6;

public class Tar03 {

	public static void main(String[] args) {

		int max = (int) (Math.random() * 41) + 10; // 10 - 50
		// max = 1;
		System.out.println("max is " + max);

		int f1 = 1;
		int f2 = 1;

		for (int i = 1; f1 <= max; i++) {
			System.out.println(i + ") " + f1);
			f2 = f1 + f2;
			f1 = f2 - f1;
		}

	}

}

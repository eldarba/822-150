package c;

public class Demo7 {

	/*
	 * create 2 random numbers (0 - 100) and print all numbers in between from the
	 * lower to higher value
	 */
	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("a=" + a + ", b=" + b);

		for (int i = a; i < b; i++) {
			System.out.println(i);
		}

	}

}

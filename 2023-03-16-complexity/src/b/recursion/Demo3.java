package b.recursion;

public class Demo3 {

	/**
	 * prints a to b assuming a < b
	 * 
	 * @param a
	 * @param b
	 */
	static void printAtoB(int a, int b) {
		if (a == b) {
			System.out.println(a);
		} else {
			System.out.println(a);
			printAtoB(a + 1, b);
		}
	}

	public static void main(String[] args) {
		printAtoB(10, 15);
	}

}

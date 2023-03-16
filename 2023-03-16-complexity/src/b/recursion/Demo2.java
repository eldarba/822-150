package b.recursion;

public class Demo2 {

	static void printOneToVal(int val) {

		if (val == 1) { // base case
			System.out.println(1);
			return;
		} else {
			printOneToVal(val - 1);
			System.out.println(val);
			return;
		}

	}

	public static void main(String[] args) {
		printOneToVal(5);

	}

}

package b.loops.breakAndContinue;

public class Demo3 {

	public static void main(String[] args) {

		while (true) {
			int x = (int) (Math.random() * 101);
			System.out.println(x);
			if (x % 2 == 0) {
				break;
			}
		}

		System.out.println("END");

	}

}

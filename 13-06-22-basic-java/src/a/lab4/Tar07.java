package a.lab4;

public class Tar07 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 7) + 1; // 1 - 7
		System.out.println(r);

		// find factorial
		int f = 1;

		for (int x = 2; x <= r; x++) {
			// f = f * x;
			f *= x;
		}
		
		// print the calculated factorial
		System.out.println(r + "! = " + f);

	}

}

package lab2;

public class Tar1 {

	/*
	 * Create a new class that defines a random number with a value between 1-6.
	 * 
	 * if the number is greater than 3 – print “Big!”
	 * 
	 * if the number is less than 3 – print “Small!”
	 * 
	 * if the number equals to 3 – print “Bingo!”
	 */

	public static void main(String[] args) {

		int r = (int) (Math.random() * 6) + 1;
		System.out.println(r);

		if (r > 3) {
			System.out.println("Big");
		} else if (r < 3) {
			System.out.println("Small");
		}else {
			System.out.println("Bingo");
		}

	}

}

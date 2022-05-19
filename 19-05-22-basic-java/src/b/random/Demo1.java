package b.random;

public class Demo1 {

	public static void main(String[] args) {
		
		// random number in the range 0 - 10 inclusive
		int r = (int) (Math.random() * 11);
		System.out.println(r);
 
		// random number in the range 0 - 100 inclusive
		r = (int) (Math.random() * 101);
		System.out.println(r);

		// random number in the range 1 - 6 inclusive
		r = (int) (Math.random() * 6) + 1;
		System.out.println(r);
	}

}

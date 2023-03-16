package a;

public class Demo4ExponentialTime {

	/**
	 * return the Fibonaci element at index n
	 * 
	 * @param n the index
	 * @return Fibonaci element at index n
	 */
	static int fib(int n) {
		// case cases
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}

		// other cases
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		int index = 40;
//		int index = 10;
		long ts1 = System.currentTimeMillis();
		System.out.println(fib(index));
		long ts2 = System.currentTimeMillis();

		System.out.println(ts2 - ts1 + " ms");
	}

}

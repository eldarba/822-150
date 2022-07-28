package d.claculator;

public class Calculator {

	// handling 1 - throws declaration
	public int divide(int a, int b) throws Exception {
		if (b != 0) {
			return a / b; // this is ok
		}

		// this is an exceptional event
		Exception e = new Exception("cannot divide by 0");
		throw e;
	}

}

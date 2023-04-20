package types;

public class Calculator {

	// field
	private double result;

	// CTOR 1
	public Calculator() {
	}

	// CTOR 2
	public Calculator(double result) {
		super();
		this.result = result;
	}

	// methods
	public void add(double value) {
		result += value;
	}

	public void sub(double value) {
		result -= value;
	}

	public void mul(double value) {
		result *= value;
	}

	public void div(double value) {
		result /= value;
	}

	public void clear() {
		this.result = 0;
	}

	public double getResult() {
		return result;
	}

}

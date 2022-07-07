package c;

public class Line { // this class extends Object

	private int length;

	public Line(int length) {
		// super();
		this.length = length;
	}

	public Line() {
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void print() {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}

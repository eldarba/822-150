package c;

public class WLine extends Line {

	private int width;

	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// override the print method so the line
	// will be printed with length and width
	@Override
	public void print() {
		for (int i = 0; i < width; i++) {
			super.print(); // invoke the super version of the method
		}

	}

}

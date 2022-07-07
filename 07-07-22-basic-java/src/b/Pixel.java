package b;

// pixel is a point
public class Pixel extends Point {

	private String color;

	// CTOR 1
	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	// CTOR 2
	public Pixel(int val, String color) {
		this(val, val, color);
	}

	// CTOR 3
	public Pixel(String color) {
		this(0, color);
	}

	// CTOR 4
	public Pixel() {
		this("black");
	}

	// methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

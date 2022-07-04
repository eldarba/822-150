package a;

public class Point {

	// private attributes
	private int x;
	private int y;
	// public attributes
	public String description;
	
	// create point at 0, 0
	public Point() {
		
	}
	
	// create point at specified location
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// create point at specified location where x, y are the same
	public Point(int val) {
		this(val, val); // call another CTOR in this class
//		this.x = val;
//		this.y = val;
	}

	// methods
	// move the point to the right and return the current x
	public int moveRight(int units) {
		x = x + units;
		return x;
	}

	// move the point to the left and return the current x
	public int moveLeft(int units) {
		x = x - units;
		return x;
	}

	public int moveUp(int units) {
		y = y + units;
		return y;
	}

	// move the point to the left and return the current x
	public int moveDown(int units) {
		y = y - units;
		return y;
	}

	public String getDetails() {
		return "(" + x + ", " + y + ")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}

package a;

public class Point {
	
	
	
	// private attributes
	private int x;
	private int y;
	// public attributes
	public String description;
	
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
	
	public String getDetails() {
		return "(" + x + ", " + y + ")";
	}
	
}

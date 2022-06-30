package b;

public class Point {

	// attributes
	private int x;
	private int y;
	
	// CTOR 1
	public Point() {
		
	}
	
	// CTOR 2
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	// methods
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0 && x <= 100) {
			this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0 && y <= 100)
			this.y = y;
	}

	public String display() {
		return "(" + x + ", " + y + ")";
	}

}

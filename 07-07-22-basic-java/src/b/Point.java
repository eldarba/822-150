package b;

public class Point {
	// attributes
	private int x;
	private int y;

	// CTOR 1
	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
	}

	// CTOR 2
	public Point(int val) {
		this(val, val);
	}

	// CTOR 3
	public Point() {
		this(0);
	}

	// methods
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

	@Override
	public String toString() {
		return "Point[x=" + this.x + ", y=" + this.y + "]";
	}
	
	

}

package d;

public class Point {

	// bounds for x / y coordinates
	// in any attempt to assign illegal values - throw an unchecked exception
	public static final int MIN = 10;
	public static final int MAX = 20;

	private int x;
	private int y;

	// CTORs: (int, int), (int), ()
	public Point(int x, int y) {
		super();
		setX(x);
		setY(y);
	}

	public Point(int val) {
		this(val, val);
	}

	public Point() {
		this(MIN);
	}

	// get / set
	public int getX() {
		return x;
	}

	public void setX(int x) throws  PointXYException{
		if (x >= MIN && x <= MAX) {
			this.x = x;
		} else {
			throw new PointXYException("ilegal x value");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws  PointXYException{
		if (y >= MIN && y <= MAX) {
			this.y = y;
		} else {
			throw new PointXYException("ilegal y value");
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}

package b;

public class Point {

	private int x;
	private int y;

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

}

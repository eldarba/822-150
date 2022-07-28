package b.constants;

public class Car4 {

	public enum Color {
		RED, GREEN, BLUE;
	}

	private Color color;

	public Car4(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Car4 car1 = new Car4(Color.GREEN);
		Car4 car2 = new Car4(Color.BLUE);
		
		System.out.println(car1.getColor());
		System.out.println(car2.getColor());
	}

}

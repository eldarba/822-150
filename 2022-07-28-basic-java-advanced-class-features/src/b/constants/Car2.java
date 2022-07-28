package b.constants;

public class Car2 {
	
	public static final int RED = 1;
	public static final int GREEN = 2;
	public static final int BLUE = 3;
	
	private int color;

	
	
	public Car2(int color) {
		super();
		this.color = color;
	}



	public static void main(String[] args) {
		Car2 car1 = new Car2(Car2.GREEN);
		Car2 car2 = new Car2(100);
	}

}

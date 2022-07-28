package c.singleton;

public class Superman {
	// fields as needed
	private int speed;

	// 1. PRIVATE CTOR
	private Superman() {
	}

	// 2. CREATING THE SINGLE INSTANCE IN THE CLASS
	private static Superman instance = new Superman();

	// 3. GETTER FOR THE SINGLE INSTANCE
	public static Superman getInstance() {
		return instance;
	}

	// methods as needed
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}

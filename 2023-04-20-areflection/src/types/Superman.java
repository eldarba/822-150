package types;

public class Superman {

	private static Superman instance = new Superman();

	private int flyingAltitude;

	private Superman() {

	}

	public static Superman getInstance() {
		return instance;
	}

	public int getFlyingAltitude() {
		return flyingAltitude;
	}

	public void setFlyingAltitude(int flyingAltitude) {
		this.flyingAltitude = flyingAltitude;
	}

}

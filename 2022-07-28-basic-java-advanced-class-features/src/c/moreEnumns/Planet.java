package c.moreEnumns;

public enum Planet {

	// a constant set of planets
	MERQURY("Merqury", 58, 5), VENUS("Venus", 66, 9), MARS("Mars", 33, 7), EARTH("Earth", 55, 4);

	// fields can be final or not
	private final String name;
	private int orbit;
	private int gravitaion;

	private Planet(String name, int orbit, int gravitaion) {
		this.name = name;
		this.orbit = orbit;
		this.gravitaion = gravitaion;
	}

	public String getName() {
		return name;
	}

	public int getOrbit() {
		return orbit;
	}

	public int getGravitaion() {
		return gravitaion;
	}

	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}

	public void setGravitaion(int gravitaion) {
		this.gravitaion = gravitaion;
	}

}

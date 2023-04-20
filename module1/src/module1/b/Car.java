package module1.b;

public class Car {
	
	private int speed;
	
	public void drive(int speed) {
		this.speed = speed;
		System.out.println("driving at speed " + speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}

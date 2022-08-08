package c;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		RaceCar raceCar = new RaceCar();
		
		// polymorphism:
		
		Car carRef; // declare a reference of certain type
		
		carRef = car; // point to car
		carRef.drive(); // use it - car behavior
		
		carRef = raceCar; // point to race car
		carRef.drive(); // use it - car behavior
	}

}

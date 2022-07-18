package app.core.tests;

import app.core.types.Bus;
import app.core.types.Passenger;

public class App4 {

	public static void main(String[] args) {

		Bus bus = new Bus();
		boolean proceed = true;
		
		while (proceed) {
			proceed = bus.addPasenger(new Passenger("---"));
		}
		
		bus.printPassengers();
		
		Passenger p = bus.removePassenger(800);
		bus.printPassengers();
		System.out.println("the removed passenger is: " + p);
	}

}

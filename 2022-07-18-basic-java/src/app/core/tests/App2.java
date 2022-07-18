package app.core.tests;

import app.core.types.Bus;
import app.core.types.Passenger;

public class App2 {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		
		
		bus1.addPasenger(new Passenger("aaa"));
		bus1.addPasenger(new Passenger("bbb"));
		bus2.addPasenger(new Passenger("ccc"));
		bus2.addPasenger(new Passenger("ddd"));
		bus2.addPasenger(new Passenger("eee"));
		
		bus1.printPassengers();
		bus2.printPassengers();
	}

}

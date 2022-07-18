package app.core.types;

public class Bus {

	private static int nextNumber = 101; // internal counter to produce bus numbers
	private final int number = nextNumber++; // the bus number
	private Passenger[] pasengers = new Passenger[10];

	public int getNumber() {
		return number;
	}

	/**
	 * add the passenger to the bus and returns true if succeeded, otherwise returns
	 * false.
	 * 
	 * @param passenger the passenger to add to the bus
	 * @return true if added, otherwise return false
	 */
	public boolean addPasenger(Passenger passenger) {
		for (int i = 0; i < pasengers.length; i++) {
			if (pasengers[i] == null) {
				pasengers[i] = passenger;
				return true;
			}
		}
		return false;
	}

	public Passenger removePassenger(int passengerId) {
		for (int i = 0; i < pasengers.length; i++) {
			Passenger curr = pasengers[i]; // get a reference to the passenger in the current index
			if (curr != null && curr.getId() == passengerId) {

			}
		}
		return null;
	}

	public void printPassengers() {
		System.out.println("======= passengers in bus " + number);
		for (Passenger passenger : pasengers) {
			if (passenger != null) {
				System.out.println(passenger);
			}
		}
		System.out.println();
	}

}

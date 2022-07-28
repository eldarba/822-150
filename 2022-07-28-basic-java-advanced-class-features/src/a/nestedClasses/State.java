package a.nestedClasses;

public class State {

	private String name;
	private int population;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	// inner class
	public class Citezen {
		private String name;
		private int age;

		public Citezen(String name) {
			super();
			this.name = name;
			State.this.population++;
		}

		public String getName() {
			return name; // citizen name
		}

		public String getStateName() {
			return State.this.name; // state name
		}
	}

	// static nested class
	public static class Flag {
		private String color;

		public Flag(String color) {
			super();
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		public void f1() {
			// in dynamic methods there is always a "this" reference
			System.out.println(this);
		}
		
		public static void f2() {
			// in static methods there is no "this" reference
			// System.out.println(this);
		}

	}

}

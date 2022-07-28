package c.moreEnumns;

import javax.swing.JOptionPane;

public class SolarSystem {

	public static void main(String[] args) {
		// get an array of all Planet instances
		Planet[] planets = Planet.values();
		for (Planet planet : planets) {
			System.out.print(planet + ", "); // print each planet
		}
		System.out.println(); // new line
		
		// get planet name from user
		String input = JOptionPane.showInputDialog("enter planet");
		// change to upper case
		input = input.toUpperCase();
		// convert String to Planet
		Planet planet = Planet.valueOf(input);

		System.out.println(planet.getName());
		System.out.println("gravitation: " + planet.getGravitaion());
		System.out.println("orbit: " + planet.getOrbit());
	} 

}

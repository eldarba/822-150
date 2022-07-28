package a.nestedClasses;

import a.nestedClasses.State.Citezen;

public class Test {

	public static void main(String[] args) {
		
		State isr = new State("Israel");
		State fra = new State("France");
		
		Citezen cz1 = isr.new Citezen("Dan");
		Citezen cz2 = isr.new Citezen("Lea");
		Citezen cz3 = isr.new Citezen("Moran");
		Citezen cz4 = fra.new Citezen("Pier");
		Citezen cz5 = fra.new Citezen("Jaque");
		
		System.out.println(cz5.getName());
		System.out.println(cz5.getStateName());
		
		System.out.println("israel: " + isr.getPopulation()); 
		System.out.println("france: " + fra.getPopulation()); 
		
		State.Flag redFlage = new State.Flag("Red");

	}

}

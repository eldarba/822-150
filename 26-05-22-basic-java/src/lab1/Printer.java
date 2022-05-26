package lab1;

public class Printer {

	public static void main(String[] args) {

		String part1 = "There will be ";
		int vistors = 5;
		String part2 = " people for dinner.";

		System.out.println(part1 + vistors + part2);
		System.out.println(part1 + (vistors + 2) + part2);
		
		vistors = vistors + 2; // increment
		vistors += 2; // short increment
		System.out.println(part1 + vistors + part2);

	}

}

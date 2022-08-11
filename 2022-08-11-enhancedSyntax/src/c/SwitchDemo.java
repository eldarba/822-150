package c;

public class SwitchDemo {

	public static void main(String[] args) {

		String mode = "high";

		switch (mode) {
		case "low":
			System.out.println("set temp to 50");
			break;
		case "high":
			System.out.println("set temp to 500");
			break;
		case "off":
			System.out.println("set temp to 0");
			break;
		}

	}

}

package d.robots;

public class Test {

	public static void main(String[] args) {
		
		Robot robot; // declare a reference of type Robot
		
		// point to a Robot
		robot = new Robot();
		robot.work();

		// point to an IRobot
		robot = new IRobot();
		robot.work();

	}

}

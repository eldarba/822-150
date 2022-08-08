package d.robots;

public class RobotUtil {
	
	// this method is using polymorphism
	public static void activiate(Robot robot) {
		robot.work();
	}
	
	public static void main(String[] args) {
		activiate(new TeacingRobot());
		activiate(new DrivingRobot());
		
		PaintingRobot r = new PaintingRobot();
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
		activiate(r);
	}

}

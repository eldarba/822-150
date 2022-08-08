package d.robots;

public class PaintingRobot extends Robot implements Chargable {
	
	private int batery = 10;

	@Override
	public void work() {
		if(batery > 0) {
			System.out.println("robot is painting");
			batery--;
		}else {
			System.out.println("batery empty - charging");
			charge();
		}
	}

	@Override
	public void charge() {
		batery = 10;
	}

	@Override
	public int getBateryLevel() {
		return batery;
	}
}

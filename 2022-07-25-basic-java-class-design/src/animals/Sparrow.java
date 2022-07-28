package animals;

public class Sparrow extends Bird implements AdvancedFlyer {
	@Override
	public void speak() {
		System.out.println("speak like a sparrow");
	}

	@Override
	public void fly() {
		System.out.println("fly like a sparrow");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a sparrow");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a sparrow");
	}

	@Override
	public void land() {
		System.out.println("land like a sparrow");
	}
}

package animals;

public class Bat extends Mammal implements Flyer, Navigator {
	@Override
	public void speak() {
		System.out.println("speak like a bat");
	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bat");
	}
}

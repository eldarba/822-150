package animals;

public class Butterfly extends Insect implements Flyer {
	@Override
	public void speak() {
		System.out.println("speak like a butterfly");
	}

	@Override
	public void fly() {
		System.out.println("fly like a butterfly");
		
	}
}

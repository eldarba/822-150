package c;

public class FunctionalController {

	public int instanceVar = 5; // instance variables can be captured
	public static int classVar = 10; // class variables can be captured

	public Randomizer getRantomizer() {

		int localVar = 100; // local variables can be captured - must be final

		Randomizer randomizer = () -> {
			int r = localVar + this.instanceVar + classVar;
			return r;
		};

		return randomizer;
	}

	public static void main(String[] args) {
		FunctionalController controller = new FunctionalController();
		Randomizer randomizer = controller.getRantomizer();
		System.out.println(randomizer.get());
		System.out.println(randomizer.get());

		controller.instanceVar = 10;
		FunctionalController.classVar = 900;

		System.out.println(randomizer.get());
		System.out.println(randomizer.get());
	}

}

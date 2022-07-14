package b.finalDemo;

public class A {

	// 1. final variable cannot be reassigned
	public final int x = 10;
	{
//		x = 5;
	}

	// 2. final methods cannot be overridden
	public final void move() {
		System.out.println("I am moving");
		// blank final
		final int localVal;
		localVal = 25;
		System.out.println(localVal);
	}

}

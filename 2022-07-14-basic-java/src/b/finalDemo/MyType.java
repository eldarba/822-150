package b.finalDemo;

public class MyType {
	// global variables - are initialized automatically to default value
	int x;

	// initializer
	{
		System.out.println(x);
		// local variables  - are NOT initialized automatically
		int y = 100;
	}

	// CTOR
	public MyType() {
		System.out.println(x);
		// local variable
		int y = 100;
	}

	// method
	public void method() {
		System.out.println(x);
		// local variable
		int y = 100;
	}

}

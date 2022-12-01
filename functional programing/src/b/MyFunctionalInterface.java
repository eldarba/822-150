package b;

@FunctionalInterface
public interface MyFunctionalInterface {

	int add(int a, int b);

	default int add2(int a, int b) {
		return a + b;
	}

	static int add3(int a, int b) {
		return a + b;
	}

}

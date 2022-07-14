package a.method.overload;

// super class of B
public class A {

	// 1
	public void doWork() {
		System.out.println("I am Working");
	}

	// 2
	// method overload
	public void doWork(int times) {
		for (int i = 0; i < times; i++) {
			doWork();
		}
	}

}

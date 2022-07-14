package a.method.overload;

// sub class of A
public class B extends A {

	// 3
	// method overload
	public void doWork(String name) {
		System.out.println(name + " is Working");
	}

	// 4
	// method override - to change original behavior
	@Override
	public void doWork() {
		super.doWork(); // us super to access super class members
		System.out.println("By the way I am B");
	}

	public static void main(String[] args) {

		B b = new B();
		b.doWork(); // 4
		b.doWork(""); // 3
		b.doWork(5); // 2

		A a = new A();
		a.doWork(); // 1
		a.doWork(3); // 2
	}

}

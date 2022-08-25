package b;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		LifeCycleThread t = new LifeCycleThread();
		System.out.println(t.getState());

		t.start();
		System.out.println(t.getState());

		Thread.sleep(500);
		System.out.println(t.getState());

		t.join();
		System.out.println(t.getState());

	}

}

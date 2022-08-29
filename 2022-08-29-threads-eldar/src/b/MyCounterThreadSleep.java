package b;

public class MyCounterThreadSleep extends Thread {

	public MyCounterThreadSleep(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("interrupted");
				break;
			}
		}
	}

}

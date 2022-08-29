package a;

public class MyStopThread extends Thread {

	public MyStopThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + ": " + i);
			if (isInterrupted()) {
				System.out.println(getName() + " interrupted and will stop");
				return;
			}
		}

	}
}

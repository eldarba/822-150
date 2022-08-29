package a;

public class MyResetThread extends Thread {

	public MyResetThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println(getName() + ": " + i);
			if (Thread.interrupted()) {
				System.out.println(getName() + " interrupted and will reset");
				i = 0;
			}
		}

	}
}

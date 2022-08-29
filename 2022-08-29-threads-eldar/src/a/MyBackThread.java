package a;

public class MyBackThread extends Thread {

	public MyBackThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + ": " + i);
			if (isInterrupted()) {
				System.out.println(getName() + " interrupted and will count down to 0");
				for (int j = i; j >= 0; j--) {
					System.out.println(getName() + ": " + j);
				}
				return;
			}
		}

	}
}

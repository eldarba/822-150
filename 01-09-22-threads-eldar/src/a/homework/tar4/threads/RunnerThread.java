package a.homework.tar4.threads;

public class RunnerThread extends Thread {

	private RunnerThread other;
	private static Object key = new Object();

	public RunnerThread(String name, RunnerThread other) {
		super(name);
		this.other = other;
	}

	public void setOther(RunnerThread other) {
		this.other = other;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName() + ": " + i);
		}

		// finish line
		synchronized (key) {
			if (!isInterrupted()) {
				other.interrupt();
				System.out.println(getName() + " won");
			} else {
				System.out.println(getName() + " lost");
			}
		}

	}
}

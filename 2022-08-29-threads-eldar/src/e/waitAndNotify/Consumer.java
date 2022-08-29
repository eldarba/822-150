package e.waitAndNotify;

public class Consumer extends Thread {

	private Stack stack;

	public Consumer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			int val = stack.pop();
			System.out.println(getName() + " popped " + val);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

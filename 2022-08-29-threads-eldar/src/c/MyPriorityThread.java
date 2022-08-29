package c;

public class MyPriorityThread extends Thread {

	public MyPriorityThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + ": " + i);
			if (this.getPriority() == Thread.MIN_PRIORITY) {
				Thread.yield();
			}
		}
		System.out.println("==============" + getName() + " terminated");
	}
}

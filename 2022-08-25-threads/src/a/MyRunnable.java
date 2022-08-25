package a;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + t.getName());
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

package core.job;

import java.util.concurrent.TimeUnit;

public class DailyJob implements Runnable {

	private Thread thread = new Thread(this, "daily job");

	@Override
	public void run() {
		while (true) {
			System.out.println("delete expired coupons");
			try {
//				TimeUnit.SECONDS.sleep(3);
				TimeUnit.DAYS.sleep(1);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	public void startJob() {
		this.thread.start();
	}

	public void stoptJob() {
		this.thread.interrupt();
	}

	public Thread getThread() {
		return thread;
	}

}

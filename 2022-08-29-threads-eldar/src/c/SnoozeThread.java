package c;

public class SnoozeThread extends Thread {
	
	{
		setDaemon(true);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Noo Kvar !!!");
		}
	}
}

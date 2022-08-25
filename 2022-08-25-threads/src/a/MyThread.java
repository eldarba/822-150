package a;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		try {
			System.out.println("AAA - " + getName());
			Thread.sleep(1500); // pause for 2 seconds
			System.out.println("BBB - " + getName());
			Thread.sleep(1500); // pause for 2 seconds
			System.out.println("CCC - " + getName());
			Thread.sleep(1500); // pause for 2 seconds
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

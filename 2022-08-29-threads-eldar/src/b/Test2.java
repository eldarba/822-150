package b;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyCounterThreadSleep("t");
		t.setDaemon(true);
		t.start();
		
		Thread.sleep(2000);
		System.out.println("Main END");

	}

}

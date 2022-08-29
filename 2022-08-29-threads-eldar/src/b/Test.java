package b;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyCounterThreadSleep("t");
		t.start();
		
		
		Thread.sleep(3000);
		
		t.interrupt();

	}

}

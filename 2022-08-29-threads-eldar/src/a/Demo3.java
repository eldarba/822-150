package a;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyResetThread("t");
		t.start();
		
		Thread.sleep(3);
		t.interrupt();
		Thread.sleep(3);
		t.interrupt();
		Thread.sleep(3);
		t.interrupt();

	}

}

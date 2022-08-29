package a;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyStopThread("t");
		t.start();
		
		Thread.sleep(10);
		t.interrupt();

	}

}

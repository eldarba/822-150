package a;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new MyBackThread("t");
		t.start();
		
		Thread.sleep(10);
		t.interrupt();

	}

}

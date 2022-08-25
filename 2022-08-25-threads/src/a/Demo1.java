package a;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread("t1");
		t1.start();
		
		MyRunnable r = new MyRunnable();
		Thread t2 = new Thread(r, "t2");
		Thread t3 = new Thread(r, "t3");
		Thread t4 = new Thread(r, "t4");
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(1);
		Thread.sleep(200); // pause for 2 seconds
		System.out.println(2);
		Thread.sleep(200); // pause for 2 seconds
		System.out.println(3);
		Thread.sleep(200); // pause for 2 seconds
		
		// we want to get a reference to the currently running thread
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		

	}

}

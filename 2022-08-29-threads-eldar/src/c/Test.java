package c;

public class Test {

	public static void main(String[] args) {
		
		MyPriorityThread t1 = new MyPriorityThread("t1");
		MyPriorityThread t2 = new MyPriorityThread("t2");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();

	}

}

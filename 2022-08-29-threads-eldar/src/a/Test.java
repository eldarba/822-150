package a;

public class Test {

	public static void main(String[] args) {
		
		MyStopThread t1 = new MyStopThread("t1");
		MyStopThread t2 = new MyStopThread("t2");
		
		t1.start();
		t2.start();
		
		System.out.println("MAIN END");

	}

}

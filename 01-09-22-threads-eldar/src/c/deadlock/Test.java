package c.deadlock;

public class Test {

	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		
		ThreadA ta = new ThreadA("A", a, b);
		ThreadB tb = new ThreadB("B", a, b);
		
		ta.start();
		tb.start();

	}

}

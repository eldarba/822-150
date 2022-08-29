package e.waitAndNotify;

public class Test {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		Producer p1 = new Producer("p1", stack);
		Consumer c1 = new Consumer("c1", stack);
		p1.start();
		c1.start();

	}

}

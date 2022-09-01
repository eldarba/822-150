package a.homework.tar4.threads;

public class Test {

	public static void main(String[] args) {
		RunnerThread t1 = new RunnerThread("t1", null);
		RunnerThread t2 = new RunnerThread("t2", t1);
		t1.setOther(t2);
		
		t1.start();
		t2.start();

	}

}

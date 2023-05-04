package a;

public class Demo1 {

	public static void main(String[] args) {

		// a task is represented by a Runnable
		Runnable task = () -> System.out.println("this is my task: " + Thread.currentThread().getName());
		
		// the task is given to a Thread object to be started
		// here we create 2 threads:
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		// starting the threads to be run concurrently
		thread1.start();
		thread2.start();

	}

}

package a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo2 {

	public static void main(String[] args) {

		// 1. the task
		Runnable task = () -> {
			
			System.out.println("task: " + Thread.currentThread().getName() + " started");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("task: " + Thread.currentThread().getName() + " ended");
			
		};
		
		// 2. the executor
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		// 3. submit a Runnable task for the executor to run
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		
		//4. executor shutdown
		executor.shutdown(); // non-blocking method - when all threads are terminated close the executor
		// executor.submit(task); // error
		
		System.out.println("End of main thread");
		

	}

}

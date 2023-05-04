package a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo3 {

	public static void main(String[] args) {

		// 1. the task
		Runnable task = () -> {

			System.out.println("task: " + Thread.currentThread().getName() + " started");
			try {
				TimeUnit.SECONDS.sleep(6);
			} catch (InterruptedException e) {
				System.out.println("task: " + Thread.currentThread().getName() + " interrupted");
				return;
			}
			System.out.println("task: " + Thread.currentThread().getName() + " ended");

		};

		// 2. the executor
		ExecutorService executor = Executors.newSingleThreadExecutor();
//		ExecutorService executor = Executors.newFixedThreadPool(3);

		// 3. submit a Runnable task for the executor to run
		executor.submit(task);

		// 4. executor shutdown
		executor.shutdown(); // non-blocking method - when all threads are terminated close the executor

		// wait for threads termination
		try {
			// block current thread until all threads are terminated or the timeout is over
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (!executor.isTerminated()) {
			System.out.println("force shutdown");
			executor.shutdownNow(); // non-blocking method - interrupt all threads in pool and close the executor
		}

		System.out.println("End of main thread");

	}

}

package a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Demo5 {

	public static void main(String[] args) {

		// the task
		Callable<Integer> task = () -> {
			TimeUnit.SECONDS.sleep(100);
			return (int) (Math.random() * 101);
		};

		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(task);
		executor.shutdown();

		System.out.println("is result ready? " + future.isDone());

		try {
//			int x = future.get(); // blocks the current thread until future is done
			int x = future.get(5, TimeUnit.SECONDS); // blocks until future is done or timed out
			System.out.println("is result ready? " + future.isDone());
			System.out.println("the result is: " + x);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}

	}

}

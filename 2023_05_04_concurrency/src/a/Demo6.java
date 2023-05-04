package a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo6 {

	public static void main(String[] args) {

		// the task
		Callable<Integer> task = () -> {
			Thread.sleep(2000);
			return (int) (Math.random() * 101);
		};

		ExecutorService executor = Executors.newSingleThreadExecutor();
//		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<Integer> future1 = executor.submit(task);
		Future<Integer> future2 = executor.submit(task);
		Future<Integer> future3 = executor.submit(task);
		executor.shutdown();

		try {
			int x = future1.get();
			System.out.println("futuer 1 result is: " + x);
			int y = future2.get();
			System.out.println("futuer 2 result is: " + y);
			int z = future3.get();
			System.out.println("futuer 3 result is: " + z);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}

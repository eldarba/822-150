package a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo5 {

	public static void main(String[] args) {
		
		// the task
		Callable<Integer> task = () -> {
			Thread.sleep(2000);
			return 5;
		};
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<Integer> future = executor.submit(task);
		
		System.out.println("is result ready? " + future.isDone());
		
		try {
			int x = future.get(); // blocks the current thread until future is done
			System.out.println("is result ready? " + future.isDone());
			System.out.println("the result is: " + x);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		

	}

}

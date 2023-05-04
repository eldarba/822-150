package a;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Demo7 {

	static Callable<String> getCallable(String result, long sleepSeconds) {
		return () -> {
			TimeUnit.SECONDS.sleep(sleepSeconds);
			return result;
		};
	}

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(3);

		// prepare a list of callables
		List<Callable<String>> callables = Arrays.asList(

				getCallable("aaa", 1),

				getCallable("bbb", 2),

				getCallable("ccc", 3)

		);

		try {
			// invoke all tasks and get a list of futures
			List<Future<String>> futures = executor.invokeAll(callables);
			executor.shutdown();

			for (Future<String> future : futures) {
				try {
					System.out.println(future.get());
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

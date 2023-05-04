package a;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo9 {

	static Callable<String> getCallable(String result, long sleepSeconds) {
		return () -> {
			TimeUnit.SECONDS.sleep(sleepSeconds);
			return result;
		};
	}

	public static void main(String[] args) {

		// prepare a list of callables
		List<Callable<String>> callables = Arrays.asList(

				getCallable("aaa", 5),

				getCallable("bbb", 2),

				getCallable("ccc", 3)

		);

		ExecutorService executor = Executors.newFixedThreadPool(3);
		try {
			// invoke all tasks and get the first future result
			String firstResult = executor.invokeAny(callables);
			executor.shutdown();
			System.out.println(firstResult);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

	}

}

package b.scheduled.tasks;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		ScheduledExecutorService scheduledExecutor = Executors.newScheduledThreadPool(1);

		Runnable task = () -> System.out.println("Task Finished");

		ScheduledFuture<?> future = scheduledExecutor.schedule(task, 5, TimeUnit.SECONDS);
		System.out.println("task schculed for 5 seconds from now");
		
		TimeUnit.SECONDS.sleep(2);
		
		long delay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.println(delay + " mili-seconds left");

		scheduledExecutor.shutdown();

	}

}

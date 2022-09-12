package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDate now = LocalDate.now();
		Task task1 = new Task("aaa", LocalDateTime.of(now, LocalTime.of(17, 55, 0)));
		Task task2 = new Task("bbb", LocalDateTime.of(now.plusDays(1), LocalTime.of(17, 55, 0)));
		
		
		Schedualer schedualer = new Schedualer(1000);
		schedualer.addTask(task1);
		schedualer.addTask(task2);
		
		schedualer.startMonitoringTasks();
		Thread.sleep(5000);
		schedualer.stopMonitoringTasks();
		
		Thread.sleep(2000);
		schedualer.startMonitoringTasks();
		Thread.sleep(5000);
		schedualer.stopMonitoringTasks();
	}

}

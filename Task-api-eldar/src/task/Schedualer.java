package task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedualer {

	private List<Task> tasks = new ArrayList<>();
	private boolean monitoringActive;
	private long checkRateMillis;
	private Thread thread;
	
	

	public Schedualer(long checkRateMillis) {
		super();
		this.checkRateMillis = checkRateMillis;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public boolean removeTask(int taskId) {
		return tasks.remove(new Task(taskId));
	}

	public void displayTasks() {
		System.out.println("Tasks ========================");
		for (Task task : tasks) {
			System.out.println(task);
		}
		System.out.println("==============================");
	}

	public Task getTask(int taskId) {
		int ind = tasks.indexOf(new Task(taskId));
		if (ind != -1) {
			return tasks.get(ind);
		}
		return null;
	}

	public List<Task> getAllTasks() {
		return this.tasks;
	}

	public List<Task> getAllTasksDueUntil(LocalDateTime time) {
		List<Task> list = new ArrayList<>();
		for (Task task : this.tasks) {
			if (task.getDeadline().isBefore(time)) {
				list.add(task);
			}
		}
		return list;
	}

	public void startMonitoringTasks() {
		if(monitoringActive) {
			throw new RuntimeException("monitoring already running");
		}
		this.thread = new Thread(new Monitor());
		this.thread.start();
		this.monitoringActive = true;
	}
	
	public void stopMonitoringTasks() {
		if(thread != null) {
			this.thread.interrupt();
			this.monitoringActive = false;
		}
	}
	
	

	public boolean isMonitoringActive() {
		return monitoringActive;
	}



	public class Monitor implements Runnable {

		@Override
		public void run() {
			try {
				while (true) {
					Thread.sleep(Schedualer.this.checkRateMillis);
					displayTaskOverdueAlert();
				}
			} catch (InterruptedException e) {
				System.out.println("monitoring interrupted and will stop");
			}
		}

	}

	public void displayTaskOverdueAlert() {
		for (Task task : tasks) {
			if (!task.isDone() && task.isOverDue() && !task.isAlertPopped()) {
				task.setAlertPopped(true);
				System.out.println("\nDEADLINE ALERT !!! " + task);
			}
		}
	}

}

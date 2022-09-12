package task;

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {

	private static int nextId = 101;

	private final int id;
	private String description;
	private boolean done;
	private LocalDateTime deadline;
	private boolean alertPopped;

	public Task(int id) {
		super();
		this.id = id;
	}

	public Task() {
		this.id = nextId++;
	}

	public Task(String description, LocalDateTime deadline) {
		super();
		this.id = nextId++;
		this.description = description;
		this.deadline = deadline;
	}

	public void doTask() {
		this.done = true;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public boolean isOverDue() {
		return this.deadline.isBefore(LocalDateTime.now());
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public boolean isAlertPopped() {
		return alertPopped;
	}

	public void setAlertPopped(boolean alertPopped) {
		this.alertPopped = alertPopped;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Task)) {
			return false;
		}
		Task other = (Task) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + ", done=" + done + ", deadline=" + deadline
				+ ", alertPopped=" + alertPopped + "]";
	}

	@Override
	public int compareTo(Task other) {
		return this.deadline.compareTo(other.deadline);
	}

}

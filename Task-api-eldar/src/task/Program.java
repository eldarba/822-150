package task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Program {

	private Scanner sc = new Scanner(System.in);
	private Schedualer schedualer = new Schedualer(1000);

	public static void main(String[] args) {
		Program program = new Program();
		program.start();
	}

	public void start() {
		lbl: while (true) {
			try {
				displayMenu();
				String choice = sc.nextLine();
				switch (choice) {
				case "start":
					schedualer.startMonitoringTasks();
					break;
				case "stop":
					schedualer.stopMonitoringTasks();
					break;
				case "add":
					doAddTask();
					break;
				case "disp":
					this.schedualer.displayTasks();
					break;
				case "x":
					schedualer.stopMonitoringTasks();
					sc.close();
					break lbl; // exit the loop
				default:
					System.out.println(choice + " is not supported");
					break;
				}
			} catch (Exception e) {
				System.out.println("Input Error: " + e.getMessage());
			}
		}

		System.out.println("Bye!");
	}

	private void doAddTask() {
		Task task = new Task();
		System.out.println("enter description");
		task.setDescription(sc.nextLine());
		System.out.print("enter deadline time today: hh:mm:ss ");
		LocalTime time = LocalTime.parse(sc.nextLine());
		task.setDeadline(LocalDateTime.of(LocalDate.now(), time));
		schedualer.addTask(task);
		System.out.println("Added: " + task);
	}

	public void displayMenu() {
		System.out.println();
		System.out.println("MENU ==================================");
		System.out.println("start monitring ................ start");
		System.out.println("stop monitring ................. stop");
		System.out.println("add task ....................... add");
		System.out.println("display all tasks .............. disp");
		System.out.println("exit ........................... x");
		System.out.print("enter choice: ");

	}

}

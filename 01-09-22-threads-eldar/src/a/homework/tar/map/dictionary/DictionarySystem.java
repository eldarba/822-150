package a.homework.tar.map.dictionary;

import java.util.Scanner;

public class DictionarySystem {

	public static void main(String[] args) {
		DictionarySystem system = new DictionarySystem();
		system.start();
	}

	private Dictionary dictionary = new Dictionary();
	private Scanner scanner = new Scanner(System.in);
	private boolean systemOn = true;

	public void start() {
		while (systemOn) {
			try {
				printMenu();
				String input = scanner.nextLine();
				switch (input) {
				case "add":
					doAdd();
					break;
				case "def":
					System.out.println("def");
					break;
				case "edit":
					System.out.println("edit");
					break;
				case "del":
					System.out.println("del");
					break;
				case "print":
					System.out.println("print");
					break;
				case "x":
					System.out.println("quit");
					systemOn = false;
					break;
				default:
					System.out.println(input + " is not a supported operation");
				}
			} catch (DictionaryException e) {
				System.out.println("========= ERROR ===========");
				System.out.println(e.getMessage());
			}
		}

		scanner.close();
		System.out.println("Bye!");
	}

	private void doAdd() throws DictionaryException {
		System.out.print("enter entry: ");
		String entry = scanner.nextLine();
		System.out.print("enter definition: ");
		String definition = scanner.nextLine();
		dictionary.addEntry(entry, definition);
		System.out.println("entry added successfully");
	}

	private void printMenu() {
		System.out.println("=============");
		System.out.println("add entry ...................... add");
		System.out.println("get definition ................. def");
		System.out.println("edit entry .................... edit");
		System.out.println("delete entry ................... del");
		System.out.println("print all entries ............ print");
		System.out.println("quit ............................ x");
		System.out.print("enter choice: ");
	}

}

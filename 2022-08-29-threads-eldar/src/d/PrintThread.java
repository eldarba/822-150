package d;

public class PrintThread extends Thread {

	private ListController listController;

	public PrintThread(String name, ListController listController) {
		super(name);
		this.listController = listController;
	}

	@Override
	public void run() {
		listController.print();
	}

}

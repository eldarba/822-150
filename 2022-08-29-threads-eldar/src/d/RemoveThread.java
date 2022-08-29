package d;

public class RemoveThread extends Thread {

	private ListController listController;

	public RemoveThread(ListController listController) {
		this.listController = listController;
	}

	@Override
	public void run() {
		
		listController.removeLastElement();
	}

}

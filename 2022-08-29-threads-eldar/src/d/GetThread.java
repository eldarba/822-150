package d;

public class GetThread extends Thread {

	private ListController listController;

	public GetThread(ListController listController) {
		this.listController = listController;
	}

	@Override
	public void run() {
		int lastElement = listController.getLastElement();
		System.out.println("last element is " + lastElement);
	}

}

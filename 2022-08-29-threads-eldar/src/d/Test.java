package d;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		ListController listController = new ListController();
		listController.add(2);
		listController.add(4);
		listController.add(6);
		listController.add(8);
		listController.add(0);

		GetThread tGet = new GetThread(listController);
		RemoveThread tRemove = new RemoveThread(listController);
		PrintThread p1 = new PrintThread("p1", listController);
		PrintThread p2 = new PrintThread("p2", listController);
		PrintThread p3 = new PrintThread("p3", listController);
//		tRemove.start();
//		tGet.start();
		p1.start();
		p2.start();
		p3.start();

	}

}

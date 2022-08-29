package d;

import java.util.ArrayList;
import java.util.List;

public class ListController {

	private List<Integer> list = new ArrayList<>();
	private Object key = new Object();

	public void print() {
		System.out.println(Thread.currentThread().getName() + ": printing elements:");
		synchronized (key) { // synchronized block
			for (Integer x : list) {
				System.out.println(Thread.currentThread().getName() + ": " + x);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// non synchronized method
	public void add(int val) {
		list.add(val);
	}

	// synchronized method
	public synchronized int getLastElement() {
		int ind = list.size() - 1; // find the last index
		try {
			Thread.sleep(1000); // this sleep is for testing
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list.get(ind);
	}

	// synchronized method
	public synchronized void removeLastElement() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.remove(list.size() - 1);
	}

}

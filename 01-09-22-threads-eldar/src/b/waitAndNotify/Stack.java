package b.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	public static final int MAX = 10;
	private List<Integer> list = new ArrayList<>();
	
	public synchronized void push(int val) {
		while(list.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(val); // push an element
		notify();
	}

	public synchronized int pop() {
		while(list.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		return list.remove(list.size()-1); // return last element
	}

}

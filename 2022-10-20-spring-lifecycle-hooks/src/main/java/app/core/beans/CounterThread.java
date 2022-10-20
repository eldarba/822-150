package app.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class CounterThread extends Thread {
	
	private boolean on = true;
	private int c = 1;

	@Override
	public void run() {
		while(on) {
			System.out.println(c++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@PostConstruct
	public void startTask() {
		this.start();
	}
	
	@PreDestroy
	public void stopTask() {
		on = false;
	}
}

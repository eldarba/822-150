package c.deadlock;

public class ThreadA extends Thread {
	
	private Object a;
	private Object b;
	
	public ThreadA(String  name, Object a, Object b) {
		super(name);
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " started");
		System.out.println(getName() +  " asking A monitor");
		synchronized (a) {
			System.out.println(getName() + " got A monitor");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(getName() + " asking B monitor");
			synchronized (b) {
				System.out.println(getName() + " got B monitor");
				
			}
		}
	}
	
	

}

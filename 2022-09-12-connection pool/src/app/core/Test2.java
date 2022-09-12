package app.core;

import java.sql.Connection;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
//		ConnectionPool.getInstance();

		Consumer c1 = new Consumer("c1");
		Consumer c2 = new Consumer("c2");
		Consumer c3 = new Consumer("c3");
		Consumer c4 = new Consumer("c4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		ConnectionPool.getInstance().closeAllConnections();

	}

	public static class Consumer extends Thread {

		public Consumer(String name) {
			super(name);
		}

		@Override
		public void run() {
			try {
				Connection con = ConnectionPool.getInstance().getConnection();
				System.out.println(getName() + " got connection: " + con);
				Thread.sleep(5000);
				ConnectionPool.getInstance().returnCOnnection(con);
				System.out.println(getName() + " returned connection");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

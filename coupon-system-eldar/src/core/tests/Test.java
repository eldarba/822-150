package core.tests;

import java.util.concurrent.TimeUnit;

import core.data.ConnectionPool;
import core.job.DailyJob;

public class Test {

	public void testAll() {

		DailyJob job = new DailyJob();

		try {
			// 1. start connection pool
			ConnectionPool.getInstance().init();
			// 2. start the job
			job.startJob();

			testAdmin();
			testCompany();
			testCustomer();

			System.out.println("application will close in 10 seconds");
			TimeUnit.SECONDS.sleep(10);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
//			e.printStackTrace();
		} finally {
			job.stoptJob();
			try {
				job.getThread().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			ConnectionPool.getInstance().cloaseAllConnections();
		}

	}

	public void testAdmin() throws Exception {
		// login and get a facade
		// do some facade actions
		System.out.println("doing admin test");
	}

	public void testCompany() throws Exception {
		// login and get a facade
		// do some facade actions
		System.out.println("doing company test");
	}

	public void testCustomer() throws Exception {
		// login and get a facade
		// do some facade actions
		System.out.println("doing customer test");
	}

}

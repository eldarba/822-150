package app.core.demos;

import app.core.Account;
import app.core.Client;

public class TestClient {

	public static void main(String[] args) {
		
		Client client = new Client(102, "Dan", 1500);
		// add account to Dan
		Account account = new Account(222, 3000);
		client.addAccount(account);
		
		
		

	}

}

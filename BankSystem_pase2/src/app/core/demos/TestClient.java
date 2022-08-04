package app.core.demos;

import app.core.Account;
import app.core.Client;
import app.core.RegularClient;

public class TestClient {

	public static void main(String[] args) {
		
		Client client = new RegularClient(102, "Dan", 1500);
		// add accounts to Dan
		System.out.println("adding 3 accounts");
		client.addAccount(new Account(222, 3_000));
		client.addAccount(new Account(333, 4_500));
		client.addAccount(new Account(444, 4_500));
		
		System.out.println("deposit 1,000");
		client.deposit(1_000);
		System.out.println("withdraw 100");
		client.withdraw(100);
		
		System.out.println("auto update accounts (3)");
		client.autoUpdateAcounts();
		
		System.out.println("client balance: " + client.getBalance());
		System.out.println("client fortune: " + client.getFortune());
		
		
		

	}

}

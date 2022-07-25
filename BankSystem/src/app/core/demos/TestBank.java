package app.core.demos;

import java.util.Arrays;

import app.core.Account;
import app.core.Bank;
import app.core.Client;

public class TestBank {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.addClient(new Client(101, "aaa", 500));
		bank.addClient(new Client(102, "bbb", 200));
		bank.addClient(new Client(103, "ccc", 300));
		

		int clientId = 101;
		Client client = bank.getClient(clientId);
		if (client != null) {
			client.deposit(1000);
			client.addAccount(new Account(201, 20000));
			client.addAccount(new Account(202, 30000));
		} else {
			System.out.println("client with id " + clientId + " not found");
		}

		System.out.println("bank balance: " + bank.getBalance());
		System.out.println("bank fortune: " + bank.getTotalFortune());

		System.out.println("all bank clients");
		for (Client currClient : bank.getClients()) {
			System.out.println(currClient.getName());
		}

	}

}

package app.core;

public class Bank {

	private Client[] clients;
	private float balance;
	Object accountUpdater; // not supported yet
	private Logger logger;

	public Bank() {
		this.clients = new Client[100];
		this.logger = new Logger(null);
	}

	public float getBalance() {
		return balance;
	}

	public float getTotalFortune() {
		float totalFortune = this.balance;
		for (Client client : clients) {
			if (client != null) {
				totalFortune += client.getFortune();
			}
		}
		return totalFortune;
	}

	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;
				// Log the operation
				Log log = new Log(client.getId(), "add client to bank", client.getFortune());
				logger.log(log);
				//
				return;
			}
		}
	}

	public void removeClient(int clientId) {
		for (int i = 0; i < clients.length; i++) {
			Client client = clients[i];
			if (client != null && client.getId() == clientId) {
				clients[i] = null;
				// Log the operation
				Log log = new Log(clientId, "remove client from bank", client.getFortune());
				logger.log(log);
				//
				return;
			}
		}
	}

	/**
	 * return the client of the specified id or null if not found
	 * 
	 * @param clientId the client to get
	 * @return
	 */
	public Client getClient(int clientId) {
		for (int i = 0; i < clients.length; i++) {
			Client client = clients[i];
			if (client != null && client.getId() == clientId) {
				return client;
			}
		}
		return null;
	}

	/**
	 * @return an array with the bank clients
	 */
	public Client[] getClients() {
		Client[] clientsToReturn = new Client[this.clients.length];
		int nextIndex = 0;
		for (Client client : this.clients) {
			if (client != null) {
				clientsToReturn[nextIndex++] = client;
			}
		}
		Client[] tempArr = new Client[nextIndex];
		System.arraycopy(clientsToReturn, 0, tempArr, 0, nextIndex);
		clientsToReturn = tempArr;
		return clientsToReturn;
	}

	public void viewLogs() {
		System.out.println("not yet supported");
	}

	public void startAccountUpdater() {
		System.out.println("not yet supported");
	}

}

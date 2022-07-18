package app.core;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts;
	private float commissionRate;
	private float interestRate;
	private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		// instantiates the Logger
		this.logger = new Logger(null);
		// constructs a new client with zero accounts
		accounts = new Account[5];
	}

	/**
	 * add the account to the array and log the operation by creating Log object
	 * with appropriate data and sending it to the Logger.log(..) method.. You
	 * should seek the array and place the Account where the first null value is
	 * found.
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				// log the operation
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "added account id: " + account.getId();
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				logger.log(log);
				//
				return;
			}
		}
	}

	/**
	 * returns the account of the specified id or null if does not exist
	 * 
	 * @param accountId
	 * @return
	 */
	public Account getAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == accountId) {
				return accounts[i];
			}
		}
		return null;
	}

	/**
	 * remove the account with the same id from the array (by assigning a 'null'
	 * value to the array[position]) & transfers the money to the clients balance.
	 * Log the operation.
	 * 
	 * @param accountId
	 */
	public void removeAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getId() == accountId) {
				Account accountToRemove = accounts[i];
				accounts[i] = null;
				// transfer the money to the client balance
				this.balance += accountToRemove.getBalance();
				// log the operation
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "remove account id: " + accountToRemove.getId();
				float amount = accountToRemove.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				logger.log(log);
				//
				return;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

}

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

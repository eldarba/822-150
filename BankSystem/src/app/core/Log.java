package app.core;

public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	/**
	 * creates a log for specified time
	 * 
	 * @param timestamp
	 * @param clientId
	 * @param description
	 * @param amount
	 */
	public Log(long timestamp, int clientId, String description, float amount) {
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	/**
	 * creates a log for current time
	 * 
	 * @param clientId
	 * @param description
	 * @param amount
	 */
	public Log(int clientId, String description, float amount) {
		this(System.currentTimeMillis(), clientId, description, amount);
	}

	public String getData() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

}

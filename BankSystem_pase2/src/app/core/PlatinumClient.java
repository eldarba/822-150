package app.core;

public class PlatinumClient extends Client {

	public PlatinumClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.01F;
		this.interestRate = 0.005F;
	}
	
	@Override
	public String toString() {
		return "PlatinumClient [id=" + getId() + "]";
	}

}

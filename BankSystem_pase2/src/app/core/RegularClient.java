package app.core;

public class RegularClient extends Client {

	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.03F;
		this.interestRate = 0.001F;
	}

	@Override
	public String toString() {
		return "RegularClient [id=" + getId() + "]";
	}
	
	

}

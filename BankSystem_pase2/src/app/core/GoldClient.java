package app.core;

public class GoldClient extends Client {

	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.02F;
		this.interestRate = 0.003F;
	}
	
	@Override
	public String toString() {
		return "GoldClient [id=" + getId() + "]";
	}
	
	

}

package app.core.dao;

public class MankTest {

	public static void main(String[] args) {
		BankService bank = new BankService();
		
		try {
			bank.trasferMoney(1, 2, 2000);
			System.out.println("done");
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

}

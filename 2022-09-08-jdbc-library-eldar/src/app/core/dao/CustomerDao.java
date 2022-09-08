package app.core.dao;

import java.sql.Connection;

public interface CustomerDao {

	void addMoney(Connection con,  int customerId, double amout);

	void takeMoney(Connection con, int customerId, double amout);

}

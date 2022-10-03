package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class Car {
	
	@Autowired
	@Qualifier("carNumber")
	private int number;
	
	abstract public void drive();

	public int getNumber() {
		return number;
	}
	
	

}

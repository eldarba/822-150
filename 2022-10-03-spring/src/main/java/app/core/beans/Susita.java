package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Susita implements Car {
	@Autowired
	private Engine v12Engine;

	@Override
	public void drive() {
		v12Engine.turnOn();
		System.out.println("Susita driving");
	}

}

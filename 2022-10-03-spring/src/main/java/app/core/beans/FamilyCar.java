package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FamilyCar implements Car {
	// basicEngine,v12Engine
	@Autowired
	@Qualifier("basicEngine")
	private Engine engine;

	@Override
	public void drive() {
		engine.turnOn();
		System.out.println("FamilyCar driving");
	}

}

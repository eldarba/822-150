package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class F1 implements Car {
	
	@Autowired
	@Qualifier("v12Engine")
	private Engine engine;

	@Override
	public void drive() {
		engine.turnOn();
		System.out.println("F1 driving");
	}

}

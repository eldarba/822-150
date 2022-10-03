package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Susita extends Car {

	private Engine v12Engine;

	@Autowired
	public Susita(Engine v12Engine) {
		super();
		this.v12Engine = v12Engine;
	}

	@Override
	public void drive() {
		v12Engine.turnOn();
		System.out.println("Susita driving");
	}

	public void setV12Engine(Engine v12Engine) {
		this.v12Engine = v12Engine;
	}

}

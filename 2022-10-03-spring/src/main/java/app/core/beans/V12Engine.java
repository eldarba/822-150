package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class V12Engine implements Engine {

	@Override
	public void turnOn() {
		System.out.println("V12Engine !!! ON");
	}

	@Override
	public void turnOff() {
		System.out.println("V12Engine !!! OFF");
	}

}

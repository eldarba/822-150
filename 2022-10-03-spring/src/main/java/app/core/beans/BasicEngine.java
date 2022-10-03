package app.core.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope("prototype")
public class BasicEngine implements Engine {

	@Override
	public void turnOn() {
		System.out.println("BasicEngine On");
	}

	@Override
	public void turnOff() {
		System.out.println(" BasicEngine Off");
	}

}

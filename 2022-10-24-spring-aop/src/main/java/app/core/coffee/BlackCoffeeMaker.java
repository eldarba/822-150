package app.core.coffee;

import org.springframework.stereotype.Component;

@Component
public class BlackCoffeeMaker implements CoffeeMaker {

	@Override
	public void makeCoffee() {
		System.out.println("making black coffee");

	}

	@Override
	public void addSugar() {
		System.out.println("adding white sugar");
	}

} 
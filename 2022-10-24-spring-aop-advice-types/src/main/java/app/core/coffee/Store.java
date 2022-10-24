package app.core.coffee;

import org.springframework.stereotype.Component;

@Component
public class Store {

	public void sellCoffee() {
		System.out.println("sell coffee");
	}

	public String sellSoup() {
		if (Math.random() < 0.5) {
			throw new RuntimeException("No Soup For You !!!");
		}
		System.out.println("Here is your soup");
		return "Here is your soup";
	} 

	public void sellCoffee(int ml) {
		System.out.println("sell coffee - " + ml + " ml");
	}

	public void sellSugar() {
		System.out.println("sell sugar");
	}

	public void sellPaperCups() {
		System.out.println("sell paper cups");
	}

	public void buyPaperCups() {
		System.out.println("buy paper cups");
	}

	public void buyCoffeeBeans() {
		System.out.println("buy coffee beans");
	}

	public void buyMilk() {
		System.out.println("buy milk");
	}

}

package app.core.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StatisticalAspect {

	public int coffeCount;
	public int suggarCount;
	public int buyCount;

	@Before("execution(void makeCoffee())")
	public void makeCoffeeCount() {
		coffeCount++;
	}

	@Before("execution(void addSugar())")
	public void addSugarCount() {
		suggarCount++;
	}

	@Before("execution(void buy*())")
	public void buyCount() {
		buyCount++;
	}

	@Before("execution(public void app.core.coffee.Store.sellCoffee(int))")
	public void countSpecific() {
		System.out.println("------------------------------- >>> specific");
	}

	// Pointcut Expression Language Syntax:
	// execution - pointcut designator
	// access level
	// return type - MUST
	// package
	// class name
	// method name - MUST
	// parameters - MUST
	// throws

	// (..) 0 or more parameters of any type
	// (.) 1 parameters of any type
	// @Before("execution(* *.*(..))")
	public void countGeneral() {
		System.out.println("------------------------------- >>> any method, any class, any package");
	}

}

package app.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.BasicEngine;
import app.core.beans.Car;
import app.core.beans.Engine;
import app.core.beans.Susita;

@Configuration
@ComponentScan
public class SpringApp2 {

	public static void main(String[] args) {

		try (var ctx = new AnnotationConfigApplicationContext(SpringApp2.class)) {
			Car car1 = ctx.getBean("f1", Car.class);
			Car car2 = ctx.getBean("familyCar", Car.class);
			Car car3 = ctx.getBean("susita", Car.class);
			car1.drive();
			car2.drive();
			car3.drive();
			
			System.out.println(car1.getNumber());
			System.out.println(car2.getNumber());
			System.out.println(car3.getNumber());
			
			System.out.println("=======");
			Car car4 = ctx.getBean("basicSusita", Car.class);
			car4.drive();
		}

	}
	
	private int nextCarNumber = 101;
	
	@Bean
	@Scope("prototype")
	public Integer carNumber() {
		return nextCarNumber++;
	}
	
	@Bean
	@Scope("prototype")
	public Susita basicSusita(@Qualifier("basicEngine") Engine engine) {
		Susita susita = new Susita(engine);
		return susita;
	}

}

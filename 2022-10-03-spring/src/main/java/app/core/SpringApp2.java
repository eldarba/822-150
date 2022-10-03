package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.core.beans.Car;

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
		}

	}

}

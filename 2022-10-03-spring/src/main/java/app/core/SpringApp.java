package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.core.beans.Superman;

@Configuration
@ComponentScan
public class SpringApp {

	@Bean
	public String message() {
		return "Welcome to spring beans";
	}

	@Bean
	public String errorMessage() {
		return "error";
	}

	public static void main(String[] args) {

		try (var ctx = new AnnotationConfigApplicationContext(SpringApp.class)) {
			System.out.println("container up");
			Superman superman = ctx.getBean(Superman.class);
			System.out.println(superman);

			String msg = ctx.getBean("errorMessage", String.class);
			System.out.println(msg);
		}

	}

}

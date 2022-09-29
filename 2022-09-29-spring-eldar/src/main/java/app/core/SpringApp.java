package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;

@ComponentScan // configuration to scan for bean definitions (@Component)
@Configuration
public class SpringApp {

	@Bean
	public Person moshe() {
		Person p = new Person(); // create the instance
		p.setName("Moshe Kohen"); // config the instance
		return p; // return the instance
	}

	@Bean
	@Scope("prototype")
	public Integer random() {
		int r = (int) (Math.random() * 101);
		return r;
	}

	public static void main(String[] args) {

		System.out.println("container starting");

		// create a spring container object
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringApp.class);

		// get a reference to a bean
		Person p1 = ctx.getBean("person", Person.class);
		System.out.println(p1);

		Integer r = ctx.getBean(Integer.class);
		Integer r1 = ctx.getBean(Integer.class);
		Integer r2 = ctx.getBean(Integer.class);
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);

		ctx.close();
		System.out.println("container closed");

	}

}

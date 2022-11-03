package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import app.core.entities.Person;
import app.core.services.PersonService;

@Component
@Order(3)
public class Test3 implements CommandLineRunner {

	@Autowired
	private PersonService service;

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person(0, "Ariela", 14);
		service.addPerson(p);
	}

}

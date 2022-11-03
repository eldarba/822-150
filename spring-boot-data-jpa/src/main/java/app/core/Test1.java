package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import app.core.entities.Person;

// @Component
@Order(1)
public class Test1 implements CommandLineRunner {

	// get a factory object for creating EntityManager instances
	@Autowired
	EntityManagerFactory factory;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("============ Test1 ==============");
		Person person = new Person();
		person.setName("Avi");
		person.setAge(32);

		// EntityManager manages a database session
		EntityManager em = factory.createEntityManager();
		// start a transaction
		em.getTransaction().begin();
		// do some db actions
		em.persist(person);
		// end the transaction
		em.getTransaction().commit();

	}

}

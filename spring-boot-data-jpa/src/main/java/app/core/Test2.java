package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import app.core.entities.Person;

//@Component
@Order(2)
public class Test2 implements CommandLineRunner {

	// get a factory object for creating EntityManager instances
	@Autowired
	EntityManagerFactory factory;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("============ Test2 ==============");

		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Person p = em.find(Person.class, 2);
		p.setName("David");
		p.setAge(p.getAge() + 5);
		System.out.println(p);
		em.getTransaction().commit();

	}

}

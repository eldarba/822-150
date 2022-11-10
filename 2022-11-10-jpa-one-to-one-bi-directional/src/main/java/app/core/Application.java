package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Address;
import app.core.entities.School;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// start a spring container
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		// get spring beans for db actions (entity manager)
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		EntityManager em = factory.createEntityManager();

		try {
			em.getTransaction().begin(); // start a transaction

			// create entities
//			Address address = new Address();
//			address.setCity("Tel Aviv");
//			address.setCountry("Israel");
//			address.setNumber(9);
//			address.setStreet("HaRimon");
//
//			School school = new School();
//			school.setName("Hadarim");
//			school.setAddress(address);

//			1. SAVING AN ENTITY
//			em.persist(school); // save the school (with the) entity to the database

//			2. FIND AN ADDRESS ENTITY
			Address address = em.find(Address.class, 1);
			School school = address.getSchool();

			System.out.println(address);
			System.out.println(school);

			em.getTransaction().commit(); // end a transaction - success
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback(); // end a transaction - failure
		}

	}

}

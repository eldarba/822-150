package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
//			School school1 = new School();
//			school1.setName("Hadarim");
//
//			List<Student> students = new ArrayList<>();
//			students.add(new Student(0, "aaa", 25));
//			students.add(new Student(0, "bbb", 17));
//			students.add(new Student(0, "ccc", 32));
//			school1.setStudents(students);
//
//			School school2 = new School();
//			school2.setName("Egozim");
//
//			List<Student> students2 = new ArrayList<>();
//			students2.add(new Student(0, "ddd", 44));
//			students2.add(new Student(0, "eee", 55));
//			school2.setStudents(students2);

//			1. SAVING AN ENTITY
//			em.persist(school1); // save the school (with the) entity to the database
//			em.persist(school2); // save the school (with the) entity to the database

//			2. FIND SCHOOL
//			School school = em.find(School.class, 2);
//			System.out.println(school);
//			if (school != null) {
//				System.out.println(school.getStudents());
//			}
//			2. DELETE SCHOOL AND STUDENTS
			School school = em.find(School.class, 2);
			System.out.println(school);
			if (school != null) {
				em.remove(school);
			}

//		

			em.getTransaction().commit(); // end a transaction - success
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback(); // end a transaction - failure
		}

	}

}

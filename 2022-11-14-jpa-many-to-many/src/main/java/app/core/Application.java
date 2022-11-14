package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Coupon;
import app.core.entities.Customer;

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

			{ // save customers with coupons
//				Customer customer1 = new Customer(0, "Yakov", null);
//				Customer customer2 = new Customer(0, "Yakov", null);
//				
//				Coupon c1 = new Coupon(0, "aaa", null);
//				Coupon c2 = new Coupon(0, "bbb", null);
//				Coupon c3 = new Coupon(0, "ccc", null);
//				Coupon c4 = new Coupon(0, "ddd", null);
//				Coupon c5 = new Coupon(0, "eee", null);
//				
//				customer1.addCoupon(c1);
//				customer1.addCoupon(c5);
//				customer1.addCoupon(c2);
//				customer1.addCoupon(c4);
//				customer2.addCoupon(c1);
//				customer2.addCoupon(c3);
//				
//				// save the customers (save their coupons because of cascade)
//				em.persist(customer1);
//				em.persist(customer2);

				{ // remove a customer
					Customer customer = em.find(Customer.class, 2);
					if (customer != null) {
						System.out.println(customer);
						for (Coupon coupon : customer.getCoupons()) {
							System.out.println(coupon);
						}

						em.remove(customer);
					}
				}
			}

			em.getTransaction().commit(); // end a transaction - success
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback(); // end a transaction - failure
		}

	}

}

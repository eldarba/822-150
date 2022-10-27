package app.core.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.annotations.MyAopAnnotation;

@Component
@MyAopAnnotation
public class TraficService {

	//@Autowired // inject this bean
	private Random random = new Random();

	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");

	}

	private String[] updates = {

			"Trafic flows",

			"Trafic Jam",

			"Trafic congested",

			"Roads busy" };

	public String getTraficUpdate() {
		int index = random.nextInt(updates.length);
		if (Math.random() < 0.5) {
			System.out.println("target will return");
			return updates[index];
		} else {
			System.out.println("target will throw");
			throw new RuntimeException("trafic service error");
		}
	}

}

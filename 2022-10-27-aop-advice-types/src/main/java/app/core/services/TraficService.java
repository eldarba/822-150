package app.core.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TraficService {

	@Autowired // inject this bean
	private Random random;

	private String[] updates = {

			"Trafic flows",

			"Trafic Jam",

			"Trafic congested",

			"Roads busy" };

	public String getTraficUpdate() {
		int index = random.nextInt(updates.length);
		if (Math.random() < 0.5) {
			System.out.println("target method runs ====================");
			return updates[index];
		}else {
			throw new RuntimeException("target method threw ====================");
		}
	}

}

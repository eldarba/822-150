package app.core.beans;

import org.springframework.stereotype.Component;

@Component
public class MathPlan implements TeachingPlan {

	@Override
	public void doPlan() {
		System.out.println("Calculate 1 + 9. Calculate the squared root of 450.");
	}

}
 
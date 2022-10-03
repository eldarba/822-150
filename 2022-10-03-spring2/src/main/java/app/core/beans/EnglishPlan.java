package app.core.beans;

import org.springframework.stereotype.Component;

@Component
public class EnglishPlan implements TeachingPlan {

	@Override
	public void doPlan() {
		System.out.println("Open English book at page 400. Start reading for 3 hours.");
	}

}
 
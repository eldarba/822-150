package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	private TeachingPlan plan;

	@Autowired
	public MathTeacher(@Qualifier("mathPlan") TeachingPlan plan) {
		super();
		this.plan = plan;
	} 

	@Override
	public void teach() {
		plan.doPlan();
	}

} 

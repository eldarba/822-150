package app.core.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Before("execution(void makeCoffee())  ||  execution(void addSugar())")
	public void log(JoinPoint jp) {
		System.out.println(">>> " + LocalDateTime.now() + " .... " + jp.getSignature().getName());
	}

}

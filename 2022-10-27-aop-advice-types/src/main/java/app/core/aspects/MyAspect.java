package app.core.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	// Advises - intercept target method calls and add the advice algorithm
	// 1. before
	@Before("trafic()")
	public void before() {
		System.out.println(">>> before");
	}

	// 2. after returning
	@AfterReturning(pointcut = trafic, returning = "msg")
	public void afterReturning(Object msg) {
		System.out.println(">>> after returning: " + msg);
	}

	// 3. after throwing
	@AfterThrowing(pointcut = trafic, throwing = "err")
	public void afterThrowing(Exception err) {
		System.out.println(">>> after throwing: " + err);
	}

	// 4. after
	@After(trafic)
	public void after() {
		System.out.println(">>> after");
	}

	// 5. around
	@Around(trafic)
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println(">>> around before");
		
		try {
			Object obj = pjp.proceed();
			return "ma she ba li";
		} catch (Throwable e) {
//			e.printStackTrace();
			return "Gam ma she ba li cha cha cha";
		}finally {
			System.out.println(">>> around after");
		}
	}

	// pointcut can be declared as a String
	public static final String trafic = "execution(* *Trafic*(..))";

	// pointcut can be declared as a Pointcut method
	@Pointcut("execution(String getTraficUpdate())")
	public void trafic() {
	};

}

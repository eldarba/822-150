package app.core.aspects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
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
public class LogAspect {

	@Pointcut("execution(String sellSoup())")
	public void sellSoup() {

	}

	// 1
	@Before("sellSoup()")
	public void logBefore(JoinPoint jp) {
		System.out
				.println(">>> @Before " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
						+ ": " + jp.getSignature().getName());
	}

	// 2
	@AfterReturning(pointcut = "sellSoup()", returning = "msg")
	public void logAfterReturn(JoinPoint jp, String msg) {
		System.out.println(
				">>> @AfterReturning " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
						+ ": " + jp.getSignature().getName() + " returned: " + msg);
	}
	
	// 3
	@AfterThrowing(pointcut = "sellSoup()", throwing = "e")
	public void logAfterThrow(JoinPoint jp, Throwable e) {
		String m = jp.getSignature().getName();
		System.out.println(">>> !!! ERROR in method " + m + " ==================== " + e.getMessage());
	}
	

	// 4
	@After("sellSoup()")
	public void logAfter(JoinPoint jp) {
		System.out
				.println(">>> @After " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
						+ ": " + jp.getSignature().getName());
	}

	// 0 - 5
	@Around("sellSoup()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("============= @Around Before");
		try {
			Object obj = pjp.proceed();
			System.out.println("============= @Around After");
			return obj;
		} catch (Throwable e) {
			return "xyz";
		}
	}
}

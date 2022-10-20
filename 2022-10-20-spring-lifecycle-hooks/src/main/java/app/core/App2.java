package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("application.properties")
public class App2 {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App2.class);
		int beanDefCount = ctx.getBeanDefinitionCount();
		System.out.println("number of beans: " + beanDefCount);
		
		String[] beanNames =  ctx.getBeanDefinitionNames();
		
		System.out.println("Bean Names:");
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		
		ctx.close();
		
	}

}

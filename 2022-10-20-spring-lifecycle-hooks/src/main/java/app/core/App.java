package app.core;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("application.properties")
public class App {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Container Starting");
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);) {
			System.out.println("Container UP");
//			MyBean bean = ctx.getBean(MyBean.class);
//			System.out.println("bean name is: " + bean.getMyBeanName());
			TimeUnit.SECONDS.sleep(5);
		}
		System.out.println("Container DOWN");

	}

}

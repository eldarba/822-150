package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import app.core.coffee.Store;

@ComponentScan
@EnableAspectJAutoProxy
public class App1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App1.class)) {
			Store store = ctx.getBean(Store.class);
			String msg = store.sellSoup();
			System.out.println(msg);
		}

	}

}

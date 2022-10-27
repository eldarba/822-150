package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.services.TraficService;

public class App1 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);) {
			TraficService service = ctx.getBean(TraficService.class);
			// call business method
			String msg = service.getTraficUpdate();
			System.out.println();
			System.out.println();
			System.out.println(msg);
		} catch (Exception e) {
			System.out.println();
			// System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}

	}

}

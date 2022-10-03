package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import app.core.beans.Teacher;

@ComponentScan
@PropertySource("application.properties")
public class SpringApp {

	public static void main(String[] args) {
		

		try (var ctx = new AnnotationConfigApplicationContext(SpringApp.class)) {
			
			Teacher teacher;
			
			teacher = ctx.getBean("englishTeacher", Teacher.class);
			teacher.teach();

			teacher = ctx.getBean("mathTeacher", Teacher.class);
			teacher.teach();
		}

	}

}

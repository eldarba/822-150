package app.core;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import app.core.entities.Student;
import app.core.entities.Student.Gender;
import app.core.servcies.AppService;

// @Component
public class Test1 implements CommandLineRunner {

	@Autowired
	private AppService service;

	@Override
	public void run(String... args) throws Exception {
		LocalDate enroll = LocalDate.of(2020, 5, 12);
		LocalDate enroll2 = LocalDate.of(2000, 5, 12);

		Student student1 = new Student(0, "aaa", 25, "aaa@mail", Gender.M, enroll2, true);
		Student student2 = new Student(0, "Yakov", 11, "yakov@mail", Gender.M, enroll, false);
		Student student3 = new Student(0, "ccc", 50, "ccc@mail", Gender.F, enroll2, true);
		Student student4 = new Student(0, "Yakov", 65, "the-yakov@mail", Gender.M, enroll, false);
		Student student5 = new Student(0, "aaa", 32, "aaa@mail", Gender.F, enroll, true);

		service.createStudent(student1);
		service.createStudent(student2);
		service.createStudent(student3);
		service.createStudent(student4);
		service.createStudent(student5);
	}

}

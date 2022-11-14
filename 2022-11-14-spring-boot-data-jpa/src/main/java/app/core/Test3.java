package app.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.core.repositories.StudentRepository;

@Component
public class Test3 implements CommandLineRunner {

	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("========================");
		System.out.println(repo.countByName("aaa"));
		System.out.println("========================");
	}

}

package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Person;
import app.core.repositories.PersonRepository;

@Service
@Transactional
public class PersonService {

	@Autowired
	private PersonRepository repo;

	public int addPerson(Person person) {
		if (repo.existsById(person.getId())) {
			throw new RuntimeException("addPerson failed - already exists");
		}
		return repo.save(person).getId();
	}

}

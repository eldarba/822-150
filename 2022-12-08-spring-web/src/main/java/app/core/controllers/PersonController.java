package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.models.Person;

@RestController
// http://localhost:8080/api
@RequestMapping("/api")
public class PersonController {

	private List<Person> persons = new ArrayList<>();

	@PostMapping
	public Person add(@RequestBody Person person) {
		persons.add(person);
		return person;
	}

	@GetMapping("/{id}")
	public Person getPerson(@PathVariable int id) {
		return persons.stream()

				.filter(element -> element.getId() == id)

				.findAny() // terminal operation that return an Optional<Person>

				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "person not found"));
	}

	@GetMapping
	public List<Person> getAll() {
		return persons;
	}

	@PutMapping
	public Person update(@RequestBody Person person) {
		Person personFromSystem = getPerson(person.getId());
		personFromSystem.setName(person.getName());
		personFromSystem.setAge(person.getAge());
		return personFromSystem;
	}

	@DeleteMapping
	public void deletePerson(int id) {
		if (!persons.remove(new Person(id, null, 0))) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person not found");
		}

	}

	@PostConstruct
	void init() {
		persons.add(new Person(101, "Dov", 32));
		persons.add(new Person(102, "Yael", 26));
		persons.add(new Person(103, "Ben", 45));
	}

}

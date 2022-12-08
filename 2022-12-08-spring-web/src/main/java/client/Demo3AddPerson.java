package client;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo3AddPerson {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		Person person = new Person(222, "Yosi", 18);
		System.out.println(person);

		// define a request object
		RequestEntity<Person> req = RequestEntity.post(baseUri).body(person);

		// send the request to the server using the exchange method
		try {
			ResponseEntity<Person> resp = rt.exchange(req, Person.class);
			System.out.println("==============");
			System.out.println(resp.getStatusCode());
			Person addedPerson = resp.getBody();
			System.out.println(addedPerson);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

package client;

import java.net.URI;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo3AddPersonSimple {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		Person person = new Person(222, "Yosi", 18);

		// send the request to the server using the exchange method
		try {
			Person addedPerson = rt.postForObject(baseUri, person, Person.class);
			System.out.println("==============");
			System.out.println(addedPerson);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

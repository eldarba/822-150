package client;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo1GetOnePerson {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		// define a request object for getting person with id 101
		RequestEntity<Void> req = RequestEntity.get(baseUri + "/103").build();
//		RequestEntity<Void> req = new RequestEntity<>(HttpMethod.GET, baseUri);

		// send the request to the server using the exchange method
		try {
			ResponseEntity<Person> resp = rt.exchange(req, Person.class);
			System.out.println("==============");
			System.out.println(resp.getStatusCode());
			Person person = resp.getBody();
			System.out.println(person);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

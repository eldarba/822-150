package client;

import java.net.URI;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo4UpdatePersonSimple {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		// send the request to the server
		try {
			rt.put(baseUri, new Person(103, "AAA", 15));
			System.out.println("updated");

		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

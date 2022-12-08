package client;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import app.core.models.Person;

public class Demo2GetAllPersonsSimple {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		// send the request to the server using the exchange method
		try {
			Person[] arr = rt.getForObject(baseUri, Person[].class);
			System.out.println("==============");
			List<Person> list = Arrays.asList(arr);
			System.out.println(list);
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

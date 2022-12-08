package client;

import java.net.URI;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Demo5DeleteOnePersonSimple {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		// send the request to the server
		try {
			rt.delete(baseUri + "?id=101");
			System.out.println("deleted");
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

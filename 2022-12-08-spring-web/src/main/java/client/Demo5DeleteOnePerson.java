package client;

import java.net.URI;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Demo5DeleteOnePerson {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		URI baseUri = URI.create("http://localhost:8080/api");

		// define a request object
		RequestEntity<Void> req = RequestEntity.delete(baseUri + "?id=101").build();

		// send the request to the server using the exchange method
		try {
			ResponseEntity<Void> resp = rt.exchange(req, Void.class);
			System.out.println("==============");
			System.out.println(resp.getStatusCode());
		} catch (RestClientException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

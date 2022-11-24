package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp2 {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		try {
			ResponseEntity<Employee> response = rt.getForEntity("http://localhost:8080/api/employees/1",
					Employee.class);
			System.out.println(response.getStatusCode());
			Employee emp = response.getBody();
			System.out.println(emp);
		} catch (HttpClientErrorException e) {
			System.out.println("Error");
			System.out.println(e.getStatusCode());
		}
	}

}

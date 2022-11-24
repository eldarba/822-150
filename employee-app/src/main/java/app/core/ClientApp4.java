package app.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp4 {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();

		String url = "http://localhost:8080/api/employees";

		Employee[] arr = rt.getForObject(url, Employee[].class);

		System.out.println("============================");
		for (Employee employee : arr) {
			System.out.println(employee);
		}

		System.out.println("============================");
		List<Employee> list = Arrays.asList(rt.getForObject(url, Employee[].class));
		System.out.println(list);
	}

}

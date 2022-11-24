package app.core;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.entities.Employee;

public class ClientApp5 {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/api/employees";

		List<Employee> list = Arrays.asList(rt.getForObject(url, Employee[].class));

		Employee emp = list.get(0);
		System.out.println(emp);
		emp.setSalary(emp.getSalary() * 1.1);
		rt.put(url, emp);

		for (Employee employee : list) {
			employee.setSalary(employee.getSalary() * 1.05);
			try {
				rt.put(url, employee);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(employee);
			}
		}
		System.out.println("updated");
	}

}

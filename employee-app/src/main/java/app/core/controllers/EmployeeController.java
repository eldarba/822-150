package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Employee;
import app.core.services.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return service.create(employee);
	}

	@GetMapping("/{employeeId}")
	public Employee read(@PathVariable int employeeId) {
		return service.read(employeeId);
	}

	@GetMapping
	public List<Employee> readAll() {
		return service.readAll();
	}

	@PutMapping
	public Employee update(Employee employee) {
		return service.update(employee);
	}

	@DeleteMapping
	public void delete(int employeeId) {
		service.delete(employeeId);
	}

}

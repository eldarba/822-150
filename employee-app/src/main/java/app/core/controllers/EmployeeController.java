package app.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.entities.Employee;
import app.core.exceptions.EmployeeSystemException;
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

//	@GetMapping("/x/{employeeId}")
//	public ResponseEntity<?> read1(@PathVariable int employeeId) {
//		try {
//			Employee emp = service.read(employeeId);
//			return ResponseEntity.ok(emp);
//		} catch (EmployeeSystemException e) {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
//		}
//	}

	@GetMapping("/{employeeId}")
	public Employee read(@PathVariable int employeeId) {
		try {
			Employee emp = service.read(employeeId);
			return emp;
		} catch (EmployeeSystemException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage(), e);
		}
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

package app.core.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entities.Employee;
import app.core.exceptions.EmployeeSystemException;
import app.core.repositories.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public Employee create(Employee employee) {
		if (!repo.existsById(employee.getId())) {
			return repo.save(employee);
		} else {
			throw new EmployeeSystemException("create employee failed - already exists");
		}
	}

	public Employee read(int employeeId) {
		Optional<Employee> opt = repo.findById(employeeId);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new EmployeeSystemException("read employee failed - not found");
		}
	}

	public List<Employee> readAll() {
		return repo.findAll();
	}

	public Employee update(Employee employee) {
		if (repo.existsById(employee.getId())) {
			return repo.save(employee);
		} else {
			throw new EmployeeSystemException("update employee failed - not found");
		}
	}

	public void delete(int employeeId) {
		Optional<Employee> opt = repo.findById(employeeId);
		if (opt.isPresent()) {
			repo.deleteById(employeeId);
		} else {
			throw new EmployeeSystemException("delete employee failed - not found");
		}
	}
}

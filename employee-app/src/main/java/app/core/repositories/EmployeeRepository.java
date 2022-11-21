package app.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.core.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

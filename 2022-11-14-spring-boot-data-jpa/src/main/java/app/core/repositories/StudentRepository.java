package app.core.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.core.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query(nativeQuery = true, value = "select * from student where name=:name")
	List<Student> findByNameNative(String name);

	@Query("from Student where name=:name")
	List<Student> findByNameJpql(String name);

	@Query("from Student where gender='M'")
	List<Student> findMales();

	@Query("from Student where gender='F'")
	List<Student> findFemales();

	// derived queries
	List<Student> findByName(String name);

	List<Student> readByName(String name);

	List<Student> queryByName(String name);

	List<Student> getByName(String name);

	int countByName(String name);

	List<Student> findByActiveTrue();

	List<Student> findByActiveFalse();

	List<Student> findByNameStartingWith(String prefix);

	List<Student> findByNameEndingWith(String sufix);

	List<Student> findByAgeGreaterThan(int age);

	List<Student> findByEnrollBefore(LocalDate date);

	List<Student> findByEnrollAfter(LocalDate date);

}

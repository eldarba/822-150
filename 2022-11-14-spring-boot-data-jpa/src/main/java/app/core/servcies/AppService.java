package app.core.servcies;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import app.core.entities.Student;
import app.core.repositories.StudentRepository;

@Service
@Transactional
public class AppService {

	@Autowired
	private StudentRepository studentRepository;

	// CRUD

	public long createStudent(Student student) {
		if (this.studentRepository.existsById(student.getId())) {
			throw new RuntimeException("createStudent failed - already exist");
		}
		student = this.studentRepository.save(student);
		return student.getId();
	}

	public Student getStudent(long studentId) {
		Optional<Student> opt = this.studentRepository.findById(studentId);
		if (opt.isPresent()) {
			Student student = opt.get();
			return student;
		} else {
			throw new RuntimeException("getStudent failed - not found");
		}
	}

	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

	public List<Student> getAllStudentsSorted(String field) {
		return this.studentRepository.findAll(Sort.by(field));
	}

	public List<Student> getMales() {
		return this.studentRepository.findMales();
	}

	public List<Student> getFemales() {
		return this.studentRepository.findFemales();
	}

	public List<Student> getAllStudents(String name) {
//		return this.studentRepository.findByNameNative(name);
//		return this.studentRepository.findByNameJpql(name);
		return this.studentRepository.findByName(name);
	}

	public void updateStudentAllFields(Student student) {
		if (this.studentRepository.existsById(student.getId())) {
			this.studentRepository.save(student);
		} else {
			throw new RuntimeException("updateStudent failed - not found");
		}
	}

	public void updateStudent(Student student) {
		Optional<Student> opt = this.studentRepository.findById(student.getId());
		if (opt.isPresent()) {
			Student persistentStudent = opt.get();
			// update name and email only
			persistentStudent.setName(student.getName());
			persistentStudent.setEmail(student.getEmail());
		} else {
			throw new RuntimeException("updateStudent failed - not found");
		}
	}

	public void deletStudent(long studentId) {
		this.studentRepository.deleteById(studentId);
	}

}

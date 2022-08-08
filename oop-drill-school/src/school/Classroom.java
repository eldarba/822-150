package school;

public class Classroom {
	
	private String name;
	private Student[] students = new Student[25];
	
	public Classroom(String name) {
		super();
		this.name = name;
	}
	
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				return;
			}
		}
	}
	
	public void printStudents() {
		System.out.println("Studens in class " + name + ": ");
		for (Student student : students) {
			if(student != null) {
				System.out.println(student);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classroom [name=" + name + "]";
	}

	public Student[] getStudents() {
		return students;
	}
	
	
	
	
	
	

}

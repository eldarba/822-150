package app.core;

public class Classroom {

	private String name;
	private Teacher teacher;
	private Student[] students = new Student[15];
	
	private int ind = 0;

	public Classroom(String name, Teacher teacher) {
		super();
		this.name = name;
		this.teacher = teacher;
	}
	
	public void addStudent(Student student) {
		this.students[ind++] = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	public double getAvg() {
		double sum = 0;
		int c = 0;
		for (Student student : students) {
			if(student!=null) {
				sum+=student.getAverage();
				c++;
			}
		}
		return sum/c;
	}

	@Override
	public String toString() {
		return "Classroom [name=" + name + "]";
	}

}

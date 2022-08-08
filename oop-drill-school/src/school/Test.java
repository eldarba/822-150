package school;

public class Test {
	
	public static void main(String[] args) {
		
		Classroom class1 = getRandomClassroom();
		Classroom class2 = getRandomClassroom();
		Classroom class3 = getRandomClassroom();
		
		
		for (int i = 0; i < 10; i++) {
			class1.addStudent(getRandomStudent());
			class2.addStudent(getRandomStudent());
			class3.addStudent(getRandomStudent());
		}
		
		class1.printStudents();
		System.out.println("grades avg: " + getAverageGrade(class1));
		System.out.println("===");
		class2.printStudents();
		System.out.println("grades avg: " + getAverageGrade(class2));
		System.out.println("===");
		class3.printStudents();
		System.out.println("grades avg: " + getAverageGrade(class3));
		System.out.println("===");
	}

	private static int nextStudentId = 101;
	private static String[] studentNames = { "Haman", "Zeresh", "Parshandata", "Lidor", "Lea", "Nisim", "Ester" };
	private static String[] classroomNames = { "New York", "India", "Paras", "Jordan"};

	// define some factory methods
	
	public static Student getRandomStudent() {
		Student student = new Student();
		student.setId(nextStudentId++);
		student.setName(studentNames[(int) (Math.random() * studentNames.length)]);
		student.setGrade((int) (Math.random() * 101));
		return student;
	}
	
	public static Classroom getRandomClassroom() {
		Classroom classroom = new Classroom(classroomNames[(int) (Math.random()*classroomNames.length)]);
		return classroom;
	}
	
	public static double getAverageGrade(Classroom classroom) {
		Student[] students = classroom.getStudents();
		int c = 0;
		int sum = 0;
		for (Student student : students) {
			if(student!=null) {
				c++;
				sum += student.getGrade();
			}
		}
		return sum / (double)c;
	}

}

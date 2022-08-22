package app.core;

public class SchoolStatistics {
	
	private static String[] peopleNames = {"Dan", "Ronna", "Gilla", "Assaf", "Nadav"};
	private static String[] classNames = {"A", "B", "C", "D", "E"};
	static int nameIndex;


	public static void main(String[] args) {
		
		School school = getRandomSchool();
		
		System.out.println("school:");
		for (Classroom classroom : school.getClassrooms()) {
			System.out.println(classroom);
			System.out.println(classroom.getTeacher());
			for (Student student : classroom.getStudents()) {
				System.out.println(student);
			}
			printClassroomAvg(classroom);
			System.out.println("===============================================");
		}
		System.out.printf("school average: %1.2f%n", getSchoolAverage(school));
		System.out.println("===============================================");
		printSchoolProffessionAverages(school);

	}
	
	public static void printSchoolProffessionAverages(School school) {
		System.out.println("School Average Per Proffession");
		for (Proffession proffession : Proffession.values()) {
			System.out.printf("%s average: %1.2f%n", proffession.name(), getSchoolAverage(school, proffession));
		}
	}
	
	public static double getSchoolAverage(School school, Proffession proffession) {
		double sum = 0;
		int c = 0;
		for (Classroom classroom : school.getClassrooms()) {
			if(classroom != null) {
				for (Student student : classroom.getStudents()) {
					if(student != null) {
						sum += student.getGrade(proffession);
						c++;
					}
				}
			}
		}
		return sum / c;
	}
	
	public static void printClassroomAvg(Classroom classroom) {
		System.out.printf("class name: %s average: %1.2f%n", classroom.getName(), classroom.getAvg());
	}
	
	public static double getSchoolAverage(School school) {
		double sum = 0;
		int c = 0;
		for (Classroom classroom : school.getClassrooms()) {
			if(classroom != null) {
				for (Student student : classroom.getStudents()) {
					if(student != null) {
						sum += student.getAverage();
						c++;
					}
				}
			}
		}
		return sum / c;
	}
	
	public static School getRandomSchool() {
		School school = new School();
		for (int i = 0; i < 5; i++) {
			school.addClassroom(getRandomClassroom());
		}
		return school;
	}
	
	public static Classroom getRandomClassroom() {
		Classroom classroom = new Classroom(classNames[nameIndex++], getRandomTeacher());
		for (int i = 0; i < 15; i++) {
			classroom.addStudent(getRandomStudent());
		}
		return classroom;
	}
	
	public static Teacher getRandomTeacher() {
		Proffession[] proffessions = Proffession.values();
		int ind = (int) (Math.random()*proffessions.length);
		Teacher teacher = new Teacher(getRandomName(), getRandomPersonAge(), proffessions[ind]);
		return teacher;
	}
	
	public static Student getRandomStudent() {
		String name = getRandomName();
		int age = getRandomPersonAge();
		Student student = new Student(name, age);
		for (int i = 0; i < Proffession.values().length; i++) {
			int gr = (int) (Math.random()*(Grade.MAX_SCORE-Grade.MIN_SCORE + 1)) + Grade.MIN_SCORE;
			student.setGrade(Proffession.values()[i], gr);
		}
		return student;
	}
	
	public static int getRandomPersonAge() {
		return (int) (Math.random()*(Person.MAX_AGE-Person.MIN_AGE + 1)) + Person.MIN_AGE;
	}
	
	public static String getRandomName() {
		return peopleNames[(int) (Math.random()*peopleNames.length)];
	}

}

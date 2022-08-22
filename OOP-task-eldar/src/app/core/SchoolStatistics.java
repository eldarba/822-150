package app.core;

public class SchoolStatistics {
	
	private static String[] peopleNames = {"Dan", "Ronna", "Gilla", "Assaf", "Nadav"};


	public static void main(String[] args) {
		
		School school = new School();
		school.addClassroom(null);
		

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

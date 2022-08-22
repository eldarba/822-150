package app.core;

public class Student extends Person {
	
	private Grade[] grades = new Grade[Proffession.values().length];
	
	{
		for (int i = 0; i < grades.length; i++) {
			grades[i] = new Grade(Proffession.values()[i], 0);
		}
	}

	public Student(String name, int age) {
		super(name, age);
	}
	
	public void setGrade(Proffession proffession, int score) {
		this.grades[proffession.ordinal()].setScore(score);
	}
	
	public int getGrade(Proffession proffession) {
		return this.grades[proffession.ordinal()].getScore();
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", age=" + getAge() + "]";
	}
	
	

	

}

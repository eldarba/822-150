package app.core;

public class Teacher extends Person {
	
	private Proffession proffession;

	public Teacher(String name, int age, Proffession proffession) {
		super(name, age);
		this.proffession = proffession;
	}

	public Proffession getProffession() {
		return proffession;
	}

	public void setProffession(Proffession proffession) {
		this.proffession = proffession;
	}

	@Override
	public String toString() {
		return "Teacher [proffession=" + proffession + ", name=" + getName() + ", age=" + getAge() + "]";
	}
	
	

}

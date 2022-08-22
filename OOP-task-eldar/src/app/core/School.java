package app.core;

public class School {
	
	private int ind;

	private Classroom[] classrooms = new Classroom[5];
	
	public void addClassroom(Classroom classroom) {
		this.classrooms[ind++] = classroom;
	}

	public Classroom[] getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(Classroom[] classrooms) {
		this.classrooms = classrooms;
	}
	
	
	

}

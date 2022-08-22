package app.core;

public class Grade {

	public static final int MIN_SCORE = 40;
	public static final int MAX_SCORE = 100;

	private Proffession proffession;
	private int score = MIN_SCORE; // 40 - 100

	public Grade(Proffession proffession, int score) {
		super();
		this.proffession = proffession;
		setScore(score);
	}

	public Proffession getProffession() {
		return proffession;
	}

	public void setProffession(Proffession proffession) {
		this.proffession = proffession;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score >= MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
		}
	}

	@Override
	public String toString() {
		return "Grade [proffession=" + proffession + ", score=" + score + "]";
	}
	
	

}

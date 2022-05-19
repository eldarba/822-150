package c.ifDemo;

public class IfDemo3 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 19);
		System.out.println(grade);

		if (grade <= 5) {
			System.out.println("Fail");
		} else if(grade <= 7) {
			System.out.println("Pass");
		}else if(grade < 10) {
			System.out.println("Good");
		}else if(grade == 10) {
			System.out.println("Great");
		}else {
			System.out.println("illegal grade");
		}

	}

}

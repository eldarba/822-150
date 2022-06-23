package b.lab10;

import java.util.Arrays;

public class Tar4 {

	public static void main(String[] args) {

		int numOfStudents = 20;
		int gradesPerStudent = 10;
		int sumClass = 0;

		int[][] grades = new int[numOfStudents][gradesPerStudent];
		for (int iStudent = 0; iStudent < grades.length; iStudent++) {
			int sumStudent = 0;
			for (int iGrade = 0; iGrade < grades[iStudent].length; iGrade++) {
				grades[iStudent][iGrade] = (int) (Math.random() * 21) + 80;
				sumStudent += grades[iStudent][iGrade];
			}
			System.out.println(Arrays.toString(grades[iStudent]));
			double studentAvg = sumStudent / (double) grades[iStudent].length;
			System.out.println("avgh of student " +(iStudent+1) + ": " + studentAvg + "\n");
			
			sumClass += studentAvg;
		}
		
		double classAvg = sumClass / (double) grades.length;
		System.out.println("==============");
		System.out.println("class average is: " + classAvg);
		
		

	}

}

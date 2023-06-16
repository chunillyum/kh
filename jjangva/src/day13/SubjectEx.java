package day13;

import java.util.Scanner;

public class SubjectEx {

	public static void main(String[] args) {
		Scans();
		System.out.println(grade.heGrade(0));
		//씨발아
	}
public static void Scans() {
	Scanner sc = new Scanner(System.in);
	System.out.println("학년 입력");
	int hegrade = sc.nextInt();
	grade stuGrade = new grade(hegrade);
	System.out.println("학생 이름 입력");
	String student = sc.nextLine();
	Student stu = new Student(student);
	System.out.println("해당 학생 점수 입력");
	int subScore = sc.nextInt();
	Score stuScore = new Score(subScore);
}
class grade{
	
	
	private int stuGrade;
	
	public grade(int stuGrade) {
		this.stuGrade = stuGrade;
	}
	public static int heGrade(int grade) {
		int heGrade = grade;
		return heGrade;
	}
	
}

class Student{
	private String studentName;
	
	public Student(String studentName) {
		this.studentName = studentName;
	}
	public static String stuName(String stuname) {
		String heName = stuname;
		heName = stuname + "학생의 학점은";
		return heName;
	}
}

class Score{
	private int score;
	
	public Score(int score) {
		this.score = score;
	}
	public static String subscore(int score) {
		String result = "";
		if(score==100) {
			result = "a학점입니다.";
		}
		return result;
	}
}
}

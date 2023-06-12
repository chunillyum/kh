package day9_class;

public class StudentScoreManager {

	public static void main(String[] args) {
		Score1 korScore = new Score1(); //korScore를 인스턴스, 객체라고 부른다.
		Score1 engScore = new Score1(1,2,"english"); 
		System.out.println(engScore.title);
	}
	//생성자를 사용하는 이유 = 멤버변수를 편리하게 초기화 하기 위해서

}
class Score1{
	String title;//과목
	int grade;//학년
	int semester;//학기
	double total;//총 점수
	double midTerm;//중간고사
	double finalTerm;//기말고사
	double performance;//수행평가
	//교재 153p 생성자 확인하기
	public Score1() {
		//Score1 클래스의 기본 생성자.(좆또 못알아먹겠음)
		/**
		 * title의 기본값은 = null
		 * grade의 기본값은 = 0
		 * total의 기본값은 = 0.0
		 * 지역변수는 초기화를 해야하나 멤버변수는 초기화가 알아서 됨
		 */
		title = "";
		grade = 1;
		semester = 1;
	}
	public Score1(int grade1, int semester1, String title1) {
		grade =  grade1;
		semester=semester1;
		title=title1;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getMidTerm() {
		return midTerm;
	}
	public void setMidTerm(double midTerm) {
		this.midTerm = midTerm;
	}
	public double getFinalTerm() {
		return finalTerm;
	}
	public void setFinalTerm(double finalTerm) {
		this.finalTerm = finalTerm;
	}
	public double getPerformance() {
		return performance;
	}
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	public Score1(String title, int grade, int semester, double total, double midTerm, double finalTerm,
			double performance) {
		
		this.title = title;
		this.grade = grade;
		this.semester = semester;
		this.total = total;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		this.performance = performance;
	}
	
}

class Student1{
	String name;//이름
	String residentNumber;//주민번호
	int grade;//학년
	int classNum;//반
	int number;//번호
	int admissionYear;//입학년도
	Score1 korScore, engScore, mathScore;//국어 영어 수학 성적
}
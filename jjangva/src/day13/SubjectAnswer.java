package day13;

import lombok.Data;

@Data
public class SubjectAnswer {
	//멤버변수
	private String title;//과목명 : 국어, 영어, 수학
	private double total;//과목의 총점 = 중간 + 기말 + 수행평가
	private double midTerm;
	private double finalTerm;
	private double performance;
	private int grade;
	private int semester;
	
	//생성자
	public SubjectAnswer(String title) {
		this.title = title;
		this.grade = 1;
		this.semester = 1;
	}

	public SubjectAnswer(String title, int grade, int semester) {//이건 생성할 때 입력해야함(생성자이기 때문)
		this.title = title;
		this.grade = grade;
		this.semester = semester;
	}
	
	//메서드
	/**중간고사 성적 추가/수정 : setMidTerm */
	
	/**기말고사 성적 추가/수정 : setFinalTerm */
	
	/**수행평가 성적 추가/수정 : setPerformance */
	
	/**성적 추가(전체)/수정 */
	public void updateScore(int midTerm, int finalTerm, int performance) {//메인 메소드에서 입력값을 입력해야함
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
		this.performance = performance;
		total = midTerm + finalTerm + performance;
	}
	/**성적 출력 */
	public void print() {
		System.out.println("title    : " + title);
		System.out.println("grade    : " + grade);
		System.out.println("semester : " + semester);
		System.out.println("mid      : " + midTerm);
		System.out.println("final    : " + finalTerm);
		System.out.println("perform  : " + performance);
		System.out.println("total    : " + total);
	}
}



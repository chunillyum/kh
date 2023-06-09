package homeWork;
//성적을 입력받아 학점을 출력하는 코드를 메소드를 이용해 작성
import java.util.Scanner;
public class MethodScoreEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 점 맞으셨나요");
		int score = sc.nextInt();
		String yourScore = thisYourScore(score);//String yourScore변수는 ,thisYourScore메소드의 리턴값을 가집니다.
		System.out.println(yourScore);
	}

	public static String thisYourScore(int score) {//정수형 매개변수를 받지만 반환은 문자열로 할 메소드입니다.
		String studentScore = "";//변수 선언과 초기화
		
		 if (score < 0 || score > 100) {
	        studentScore = "유효하지 않은 점수입니다.";
		 }
		else if(score>=90) {
			studentScore = "A 학점입니다.";
		}
		else if(score<90) {
			studentScore = "B 학점입니다.";
		}
		else if(score<80) {
			studentScore = "C 학점입니다.";
		}
		else if(score<60) {
			studentScore = "D 학점입니다.";
		}
		return studentScore;
		
		}

}

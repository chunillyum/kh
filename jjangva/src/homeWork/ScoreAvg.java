package homeWork;
import java.util.Scanner;

public class ScoreAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 몇 점 맞았어요");
		int kor = sc.nextInt();
		System.out.println("영어 몇 점 맞았어요");
		int eng = sc.nextInt();
		System.out.println("수학 몇 점 맞았어요");
		int math = sc.nextInt();
		
		int result =+ kor+eng+math;
		System.out.println("당신의 평균 점수는 " + (double)result/3 + "점 입니다.");
		
		
//		첫번째	//국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
//		(package : day4.homework, file : ScoreAverageEx)
//		성적은 정수.
	}

}

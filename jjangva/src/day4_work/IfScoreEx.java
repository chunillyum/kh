package day4_work;
import java.util.Scanner;
public class IfScoreEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 점 맞았어요?");
		int score = sc.nextInt();
		if (score>=90 && score<=100) {
			System.out.println("A 학점입니다.");
		}
		else if(score>=80 && score<=89) {
			System.out.println("B 학점입니다.");
		}
		else if(score>=70 && score<=79) {
			System.out.println("C 학점입니다.");
		}
		else if(score>=60 && score<=69) {
			System.out.println("D 학점입니다.");
		}
		else if(score<60 && score>=0) {
			System.out.println("F 학점입니다.");
		}
		else {
			System.out.println("wrong score");
		}
		
		

}
	}
	



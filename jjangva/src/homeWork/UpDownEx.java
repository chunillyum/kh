package homeWork;
import java.util.Scanner;
public class UpDownEx {
//	UpDown게임
//	1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맞추는 게임을 구현하세요.
//	(package : day5.homework, file : UpDownEx)
//	랜덤한 수 : 45
//	input : 50
//	Down!
//	input : 40
//	Up!
//	input : 45
//	Good!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		System.out.println("숫자를 맞춰보세요!");
		int answer = 0;
		for(;answer != random;) {
			answer = sc.nextInt();
		if(answer<random) {
			System.out.println("up!");
		}
		else if(answer>random) {
			System.out.println("Down!");
		}
		else if(answer==random) {
			System.out.println("Good!");
		}
		}
		
	}
}

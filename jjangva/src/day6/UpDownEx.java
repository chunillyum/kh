package day6;
//;;;;;;;;
import java.util.Scanner;

public class UpDownEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		System.out.println(random + "숫자를 맞춰보세요!");
		int answer = 0;
		for(;answer != random;) {//for문에서 세미콜론은 반드시 2개를 써야함. 그래서 첫번째 ;을 쓴 것.
			answer = sc.nextInt();
			sc.nextLine();//문제 해결이 안 된 원인. 개행문자 소비를 안 해서 25줄의 입력값이 입력되지 않음.
		if(answer<random) {
			System.out.println("up!");
		}
		else if(answer>random) {
			System.out.println("Down!");
		}
		else if(answer==random) {
			System.out.println("Good!");
			System.out.println("continue?\ny/n");
		if(answer==random) {
			String con=sc.nextLine();
		if (con.equals("y")) {
			answer=0;
			System.out.println("숫자를 맞춰보세요!");
		}
		}
		}
		}
	}
}
//!sc.nextLine().equals("y")
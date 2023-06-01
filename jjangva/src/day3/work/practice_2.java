package day3.work;

import java.util.Scanner;

public class practice_2 {
	static String str;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		if(score>=60) {
			str = "pass";
		}
		System.out.println(str + "! 정말 잘하셨어요");
		
	}

}

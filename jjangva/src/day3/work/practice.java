package day3.work;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int score = sc.nextInt();
		System.out.println("성적이 60점 이상입니까?:"+ (score>=60));
		
	}

}

package day5.switchEx;

import java.util.Scanner;

public class SeasonEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("지금은 몇 월입니까?");
		int month = scanner.nextInt();
		switch(month) {
		case 12, 1, 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3, 4, 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6, 7,8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println(month + "월은 가을입니다.");
			break;

	}
}
}

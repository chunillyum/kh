package day4;

import java.util.Scanner;

public class IfArithmeticEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("두 수를 어떻게 할까요?\n 더한다/뺀다/곱한다/나눈다");
		String str1 = sc.next();

		if ("더한다".equals(str1)) {
			System.out.println(num1 + num2);
		} else if ("뺀다".equals(str1)) {
			System.out.println(num1 - num2);
		} else if ("곱한다".equals(str1)) {
			System.out.println(num1 * num2);
		} else if ("나눈다".equals(str1)) {
			System.out.println((double) num1 / num2);
		} else {
			System.out.println("제대로 입력해라ㅇㅇ");
		}

	}
}


package homeWork;
import java.util.Scanner;

public class day2_HomeWork {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요");
		int num2 = sc.nextInt();
		sc.nextLine();	
		System.out.println("두 수를 어떻게 할까요?\n 더한다/뺀다/곱한다/나눈다");
		String str1 = sc.next();
		
		if("더한다" .equals(str1)) {
			System.out.println(num1 + num2);
		}
		else if ("뺀다" .equals(str1)) {
			System.out.println(num1-num2);
		}
			else if ("곱한다" .equals(str1)) {
				System.out.println(num1*num2);
			}
				else if ("나눈다" .equals(str1)) {
					System.out.println(num1/num2);
		
		}

	}
}

// 1. 콘솔에서 정수 2개와 문자(산술 연산자)를 입력받아 출력하는 코드를 작성

//예
//
//(입력값) 1+2
//
//(출력값)3

// 2. 두 정수를 입력 받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요
//(입력값) 10   20
//(출력값) 10 * 20 = 200
// 10 + 20 = 30
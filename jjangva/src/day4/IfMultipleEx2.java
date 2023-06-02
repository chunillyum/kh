package day4;
import java.util.Scanner;
public class IfMultipleEx2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);   if문 핵심. 조건이 만족하면 뒤에 나오는 else들 싹 다 스킵함
//		System.out.println("정수를 입력하세요");
//		int num = sc.nextInt();
//		if(num%2 == 0) {
//		System.out.println("2의 배수가 맞군요");//6 또는 12를 입력해도 2의 배수라고 나온다. 해결법은 순서를 바꾼다.
//	}
//		else if(num%3 ==0) {
//			System.out.println("3의 배수네요");
//		}
//		else if(num%6 ==0) {
//			System.out.println("6의 배수네요");
//		}
//			else {
//				System.out.println("ㅗ");

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num%6 == 0) {
		System.out.println("6의 배수가 맞군요");
	}
		else if(num%3 ==0) {
			System.out.println("3의 배수네요");
		}
		else if(num%2 ==0) {
			System.out.println("2의 배수네요");
		}
			else {
				System.out.println("ㅗ");
			}
	}
}//두 번째 방법
//Scanner sc = new Scanner(System.in);
//System.out.println("정수를 입력하세요");
//int num = sc.nextInt();
//if(num%2 == 0 && num % 3 !=0) {       2의 배수이고 3의 배수인 6을 빼놓기 위해 조건 연산을 사용. 머리가 띵하노
//System.out.println("2의 배수가 맞군요");//
//}
//else if(num%3 ==0 && num % 2 != 0) {
//	System.out.println("3의 배수네요");
//}
//else if(num%6 ==0) {
//	System.out.println("6의 배수네요");
//}
//	else {
//		System.out.println("ㅗ");

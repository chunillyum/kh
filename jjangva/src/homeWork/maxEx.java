package homeWork;
import java.util.Scanner;

public class maxEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 해라");
		int num1 = sc.nextInt();
		System.out.println("하나 더 입력 해라");
		int num2 = sc.nextInt();
		if(num1<num2) {
			System.out.println(num2+"가 더 큰 숫자입니다");
		}
		else if(num1>num2) {
			System.out.println(num1+"가 더 큰 숫자입니다.");
		}
		
//		두 정수를 입력받아 두 정수 중 큰 수를 출력하는 코드를 작성하세요.
//		(package : day4.homework, file : MaxEx)
	}

}

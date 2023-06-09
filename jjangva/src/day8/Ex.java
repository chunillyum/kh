package day8;
import java.util.Scanner;
public class Ex {
	
	public static int even(int num1) {
		if(num1%2==0) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다.");
			}
		return num1;
	}
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	public static boolean isEven(int num1) {
		return num1%2==0;
		
	}
	public static boolean isMultiple(int num1, int num2) {
		return num1%num2==0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int answer=sc.nextInt();
		even(answer);
		System.out.println(mod(10,2));
		System.out.println(isEven(3));
		System.out.println(isMultiple(12,3));
//		System.out.println(even(answer)); 라고 치면 even메소드의 num1 값이 그대로 출력 된다. 즉
		//짝수입니다. 이후 유저의 입력값이 또 한번 출력됨. 해결법은 sysout을 빼고 메소드 이름만 넣어주기
	}

}

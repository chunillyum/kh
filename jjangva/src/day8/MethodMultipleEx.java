package day8;
import java.util.Scanner;
public class MethodMultipleEx {
	
	public static boolean multiple(int num1) {
		return num1%2==0||num1%3==0||num1%6==0;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int number = sc.nextInt();
		System.out.println(multiple(number));
	}

}

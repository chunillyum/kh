package day7;
import java.util.Scanner;
public class LCMEx {
//두 수를 입력받아 두 수의 최소 공배수를 구하는 식
	//break문 활용
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		for(int i=1; ; i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
			}
		}
	}
}

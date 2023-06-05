package day5.Practice;
import java.util.Scanner;
public class DivisorEx {
//정수 num을 입력 받아 num의 약수를 출력하는 예제(num을 나눈 값이 0이 될 때까지)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {//num을 나눈 값이 i이고 그게 0일때 조건을 충족하여 if문 안의 출력문 실행
				//그게 아니라면 다시 i++한 채로 for문 실행
				System.out.println(i);
			}
		}
	}

}

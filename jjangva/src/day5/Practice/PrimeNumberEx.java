package day5.Practice;
import java.util.Scanner;
public class PrimeNumberEx {
//정수 num을 입력 받아 num의 약수를 출력하는 예제(num을 나눈 값이 0이 될 때까지)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num %i == 0) {
			count++;
			}
		}
			if(count==2) {
				System.out.println(num+"는 소수입니다.");
			}
			else {
				System.out.println(num+"는 소수가 아닙니다.");
			}
	}

}

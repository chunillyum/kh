package day6;
import java.util.Scanner;
public class SumEx2 {
//정수를 입력 받아 짝수의 합을 계산하는 코드
	//구현 못함 집가서 해야댐
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int sNum = sc.nextInt();
		int sum = 1;
		for(int i = sum; i<=sNum;) {
			if(i%2 ==0) {
				sum +=i;
			}
			i++;
			System.out.println(sum);
		}
		}
	}

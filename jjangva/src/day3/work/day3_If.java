package day3.work;
import java.util.Scanner;
public class day3_If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수입니다.");
		}
		else if(num<0) {
			System.out.println("음수입니다");
		}
		else if(num==0) {
			System.out.println("0이네요");
		}
	}

}

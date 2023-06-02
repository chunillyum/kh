package day4;
import java.util.Scanner;
public class EvenNumberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("숫자 " + num + "은 " +"짝수입니다.");
		}
		else if(num%2 !=0) {
				System.out.println("홀수입니다.");
			}
		}


		
		
	}
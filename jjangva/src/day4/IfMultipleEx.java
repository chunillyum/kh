package day4;
import java.util.Scanner;
public class IfMultipleEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 바람");
		int num = sc.nextInt();
		System.out.println(num%2==0 ? "2의 배수네요!" : "2의 배수가 아니네요");
//		if(num%2 == 0) {
//			System.out.println("2의 배수가 맞군요");
//		}
//			else if(num%2 != 0) {
//				System.out.println("2의 배수가 아닌 것 같네요");
//			}
//				else {
//					System.out.println("ㅗ");
//				}
			}

}

package day4_work;
import java.util.Scanner;
public class Work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		if(age<20) {
			System.out.println(age + "세는 미성년자입니다");
		}
		else if (age>=20) {
			System.out.println(age + "세는 성인입니다.");
		}
				
	}

}

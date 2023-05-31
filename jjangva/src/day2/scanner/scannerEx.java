package day2.scanner;
import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println(num1);
		
		System.out.println("실수를 입력해주세요");
		double num2 = sc.nextDouble();
		System.out.println(num2);
		
		System.out.println("문자열1을 입력해주세요");
		sc.nextLine();
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		System.out.println("문자열2을 입력해주세요");
		sc.nextLine();
		String str2 = sc.next();
		System.out.println(str2);
		
		System.out.println("문자를 입력하세요");
		char ch = sc.next().charAt(0);
		System.out.println(ch);//next()를 이용해서 한 단어를 읽어오고 읽어온 단어의 첫글자를 가져옴
		//여태 명령프롬트로 스캐너를 실행했는데 콘솔창에서도 입력을 할 수 있다는 걸 알았다.
		//근데 글자수 제한이 있는 것 같다
	}

}
//여태 명령프롬트로 스캐너를 실행했는데 콘솔창에서도 입력을 할 수 있다는 걸 알았다.
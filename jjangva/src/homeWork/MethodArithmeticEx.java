package homeWork;
import java.util.Scanner;
public class MethodArithmeticEx {
//두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 메소드를 이용해 작성
	//연산자를 잘못 입력한 경우는 없음. 0으로 나누는 일도 없음.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("두 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.nextLine();//얘가 Int입력값 밑에 있어야만 제 역할을 함.
		System.out.println("어떠한 연산을 하실 건가요?\n +,-,*,/");
		String userChoice = sc.nextLine();
		double result = getNumber(num1, num2, userChoice);//result 변수는 getNumber 메소드의 리턴값을 가집니다.
		System.out.println(result);//getNumber 메소드의 리턴값을 가진 result를 출력하시오.
	}
	
	public static double getNumber(int number1, int number2, String str) {//num1, num2, userChoice
		int result = 0;
		if(str.equals("+")) {
			result=number1+number2;
		}
		else if(str.equals("-")) {
			result=number1-number2;
		}
		else if(str.equals("*")) {
			result=number1*number2;
		}
		else if(str.equals("/")) {
			result=number1/number2;
		}
		return result;
		
	}

}

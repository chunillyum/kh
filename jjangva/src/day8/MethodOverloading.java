package day8;

public class MethodOverloading {
//메소드 오버로딩
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println("1");
		System.out.println(sum (1,1));
		System.out.println(sum(1.1,1));
		System.out.println(sum(1,1.1));
		System.out.println(sum(1.1, 1.1));
		System.out.println(sum(1,2,3));
	}
	
	public static int sum (int num1, int num2) {
		return num1 + num2;
	}
	//매개변수 타입이 다른 경우
	public static double sum (double num1, int num2) {
		return num1 + num2;
	}
	public static double sum (int num1, double num2) {
		return num1 + num2;
	}
	public static double sum (double num1, double num2) {
		return num1 + num2;
	}
	//같은 이름의 sum 메소드이지만 매게변수가 다르기 때문에 에러가 발생하지 않음
	/*
	public static double sum (int num1, int num2) {
		return num1 + num2;//반환값 타입이 달라도 매게변수가 같아서 첫번째 sum과 겹쳐 에러가 발생.
	}
*/	//매개변수 개수가 다른 경우
	public static double sum (int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

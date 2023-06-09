package day11.array;

public class ArrayMethodEx {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		System.out.println("num1 = " + num1 + ", num2  = " + num2);
		//정수를 교환하는 가장 기본적인 방법
		//새로운 변수를 만들어 교환한다.
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		System.out.println("num1 = " + num1 + ", num2  = " + num2);
		System.out.println("=====");
		num1 = 10;
		num2 = 20;
		System.out.println("num1 = " + num1 + ", num2  = " + num2);
		swap(num1, num2);//안 바뀜. 메소드는 복사본으로 실행하기 때문
		System.out.println("num1 = " + num1 + ", num2  = " + num2);
	}
	

	public static void swap(int num1, int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
	}
	
}


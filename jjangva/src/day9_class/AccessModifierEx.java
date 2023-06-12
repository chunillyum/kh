package day9_class;

import day9_classEx2.B;

public class AccessModifierEx {

	public static void main(String[] args) {
		A a = new A();//A클래스를 참조한 a라는 참조변수(객체)생성
		B b = new B();
		a.Print();//사용할 땐 참조변수 + . + 참조변수의 메소드
		/**
		 * AccessModifierEx 클래스와 A 클래스는 같은 패키지에 있는 클래스
		 * AccessModifierEx 클래스와 B 클래스는 다른 패키지에 있는 클래스
		 * num3은 접근 제어자가 public. 같은 패키지이든 아니든 상관없음.
		 * 
		 */
		a.num3 =10;
		b.num3=20;
		
		a.num2=10;
		//setter를 통해 값을 변경
		a.setNum1(15);
		//getter를 통해 값을 가져옴
		System.out.println(a.getNum1());
//		b.num2=20; 다른 패키지에 있어서 접근 불가
	}

}

class A{
	private int num1;
	int num2;
	public int num3;
	
	public void Print() {
		num1 = 10;//class A는 내꺼라 그냥 출력 가능
		System.out.println(num1);
	}
	//private으로 된 num1에 접근하기 위해 getter를 추가
	public int getNum1() {
		return num1;
	}
	//private으로 된 num1의 값을 변경하기 위해 setter를 추가
	public void setNum1(int _num1) {
		num1 = _num1;
	}
}


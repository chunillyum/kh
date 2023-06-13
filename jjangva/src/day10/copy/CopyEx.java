package day10.copy;

public class CopyEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = num1;
		System.out.println(num1 + " , " + num2);
		num2 = 30;
		System.out.println(num1 + " , " + num2);
		
		A a1 = new A();
		A a2 = a1;
		System.out.println(a1.num1 + " , " + a2.num1);
		a2.num1 = 20;
		System.out.println(a1.num1 + " , " + a2.num1);
	}

}
class A{
	public int num1;
}
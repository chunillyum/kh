package day7_method;

public class ArithemticMethodEx {

	public static void main(String[] args) {
		System.out.println(sum(8,13));
		System.out.println(sub(1,2));
		System.out.println(mul(1,2));
		System.out.println(div(1,2));
		System.out.println(mod(1,2));
		sum2(1,3);
	}
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static int sum(int num1, int num2) {
	return num1+num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / (double)num2;
	}
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
}

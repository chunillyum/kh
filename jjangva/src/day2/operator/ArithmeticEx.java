package day2.operator;

public class ArithmeticEx {

	public static void main(String[] args) {
		int num1=1, num2=2;
		int sum= num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		double div = (double)num1/num2;
		int mod = num1%num2;
		System.out.println(""+num1+'+'+num2+"="+sum);
		System.out.println(""+num1+'-'+num2+"="+sub);
		System.out.println(""+num1+'*'+num2+"="+mul);
		System.out.println(""+num1+'/'+num2+"="+div);
		System.out.println(""+num1+'%'+num2+"="+mod);
	}

}

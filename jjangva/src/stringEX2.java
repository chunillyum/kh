
public class stringEX2 {

	public static void main(String[] args) {
		String str ="";
		char op = '+';
		int num1 =1, num2 =2;
		//num1 + op가 먼저 계산되어 +에 해당하는 43과 1 이 더해져서 44가 됨
		//44와 2가 더해져서 46
		//46과 문자열 =이 더해져서 문자열 46=
		str = ""+num1 + op + num2 + "=" + (num1+num2);
		System.out.println(str);
		//빈문자열고ㅓ num1이 계산 되어 문자열1
		//문자열 1과 +가 더해져서 문자열 1+
		//문자열 1+와 2가 더해져서 문자열 1+2
	}

}

package homeWork;
//*****
//?????
//^^^^^^
public class MethodPrintCharEx {//다음과 같이 출력하기 위한 코드를 메소드로 작성(한줄씩
	
	public static String a() {
		return "*****";
	}
	public static String b() {
		return "^^^^^^";
	}
	public static String c() {
		return "?????";
	}
	public static void main(String[] args) {
		System.out.println(a());
		System.out.println(b());
		System.out.println(c());
		strAndNum("hi", 3);
		
	}
	//문자와 개수가 주어지면 주어진 문자를 개수만큼 출력하는 메소드
	public static void strAndNum(String str, int num ) {
		for(int i=0; i<num; i++) {
			System.out.println(str);
		}
	}
	//문자와 개수, 마지막 문자가 주어지면 주어진 문자를 개수만큼 출력하고 마지막 문자를 출력하는 매소드


}

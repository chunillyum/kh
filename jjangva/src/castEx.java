
public class castEx {

	public static void main(String[] args) {
		//3.14는 더블형 리터럴이기 때문에 int에 저장할 수 없음. 강제 형변환을 해야함
		int pi = (int)3.14;
		//3은 int형 리터럴이기 때문에 더블형 정수에 저장할 수 있음. 자동 형변환
		double num1 = 3;
		int num2 = (int)123L;
		
		System.out.println((double)1/2);
		//1/2는 문법에선 문제가 없지만 원하는 결과인 0.5가 안 나오기 때문에 강제형변환을 하였음
		
	}//.

}

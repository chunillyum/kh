package day3.work;

public class SCEEx {

	public static void main(String[] args) {
		String str = null;
		System.out.println("Is "+str+" equal to abc?" +(str != null && str.equals("abc"))
				);
		System.out.println("Is "+str+" equal to abc?" +(str.equals("abc") &&str != null));
	}
	//비교연산 (&&는 앞에 오는 항의 값을 계산 후 그 값이 만족한다면 뒤에 있는 항은 계산조차 안 함)
}

package day3.work;

public class ConditionalEx {

	public static void main(String[] args) {
		//나이가 20살 이상이면 성인, 아니면 미성년자를 출력하는 코드를 작성하시오
		int age = 30;
		String str;
		
		str = age >= 20 ? "성인" : "미성년자";
		System.out.println(age + "세는 " + str);
	}

}

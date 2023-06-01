package day3.work;

public class LogicalEx {

	public static void main(String[] args) {
		int score = 75; //성적(score)이 80점 이상이고, 성적이 90점 미만인가?
		System.out.println(score + "점은 b 학점인가?" + (score>80 && score<90));
		
		//15세는 성인입니까?
		int age = 15;
		boolean isAdult = age>=20;
		System.out.println("Is  " + age + "years old a minor?" + !isAdult);
		//   ! 는 부정
		
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		System.out.println("Can I take Toeic?" + (hasIdCard || hasDriverCard));
		//민증은 있는데 운전면허증은 없다. 토익 볼 수 있냐? 
		//    ||는 or 연산(둘 중 하나라도 참이면 가능)
	}

}

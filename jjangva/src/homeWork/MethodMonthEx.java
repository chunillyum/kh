package homeWork;
//월을 입력받아 월에 맞는 영어를 메소드를 이용하여 출력
	// ex) 입력값:3 // 출력값 March
	//public static String month(int num) 이런 식으로 하믄 될 듯ㅇ
import java.util.Scanner;
public class MethodMonthEx {

	public static String season(int month) {//매개변수(유저의 입력값)은 int로 받지만 반환(return)값은 문자열
		switch(month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return"December";
			default://메소드 바깥에 return값을 정할 수 없어서 어쩌나 싶었는데 switch문 안에 default와 return값을 넣으니 해결됨.
				return "없는 월 입니다.";
		}//switch문 말고 더 좋은 방법이 있었을까?여태 배운 것중에.
		//풀이 결과 강사님도 switch문으로 푸셨음.
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월?");
		int month = sc.nextInt();
		String monthName = season(month);//monthName이라는 문자열 변수는 season(month)메소드의 리턴값을 가집니다.
		System.out.println(monthName);
	}
}

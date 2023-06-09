package homeWork;
//월을 입력받아 월에 맞는 영어를 메소드를 이용하여 출력
	// ex) 입력값:3 // 출력값 March
	//public static String month(int num) 이런 식으로 하믄 될 듯ㅇ
import java.util.Scanner;
public class MethodMonthEx {
	
	public static String season(int month) {
		switch(month) {
		case 1:
			return "겨울임";
		case 
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월?");
		int month = sc.nextInt();
		System.out.println(season(month));
	}

}

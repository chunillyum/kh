package day8;
import java.util.Scanner;

public class MethodSeasonEx {
	
	public static String season(int month) {
		if(month==12 || month<3) {
			return "겨울입니다.";
		}
		else if(month>=3 && month<6) {
			return "봄입니다.";
		}
		else if(month>=6 && month<9) {
			return "여름입니다.";
		}
		else if(month>=9 && month<12) {
			return "가을입니다.";
		}
		else {
			return "잘못된 입력입니다.";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력해주세요");
		int month = sc.nextInt();
		System.out.println(season(month));
	}

}

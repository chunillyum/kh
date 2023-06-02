package day4;
import java.util.Scanner;
public class SeasonEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("지금은 몇 월입니까?");
		int month = scanner.nextInt();
		if(month>=3 && month<=5) {
			System.out.println(month + "는 봄입니다.");
		}
			else if (month>=6 && month<=8) {
				System.out.println(month + "는 여름입니다.");
				
			}
				else if(month>=9 && month<=11) {
					System.out.println(month + "는 가을입니다.");
				}
					else if (month==12 || (month >= 1 && month<=2)) {
						System.out.println(month + "는 겨울입니다.");
						//&&연산과||연산을 함께 사용하는 경우 잘못된 출력을 주의. 그래서 괄호로 감쌈.
					}
					else {
						System.out.println("잘못된 입력입니다.");
					}
		}
		
	}



//int season[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//if(month = season[11, 0, 1]) {
//	System.out.println();
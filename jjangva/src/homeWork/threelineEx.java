package homeWork;
import java.util.Scanner;
public class threelineEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 변은 몇 센치인가요?");
		int firstLine = sc.nextInt();
		System.out.println("두 번째 변은 몇 센치인가요?");
		int secondLine = sc.nextInt();
		System.out.println("세 번째 변은 몇 센치인가요?");
		int thirdLine = sc.nextInt();

		if(thirdLine < firstLine + secondLine) {
		System.out.println("삼각형을 만들 수 있겠군요!");
		}
		else if (thirdLine > firstLine + secondLine) {
		System.out.println("못 만듭니다!");
		}
        }
	}
	



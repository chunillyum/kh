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
		System.out.println("===================");
        System.out.print("세 변의 길이를 말해주세요. xxcm, yycm, zzcm");
        String Line = sc.nextLine();
        String[] threeLine = Line.split(",");
        int lineFirst = Integer.parseInt(threeLine[0]);
        int lineSecond = Integer.parseInt(threeLine[1]);
        int lineThrid = Integer.parseInt(threeLine[2]);
        if(lineFirst+lineSecond<lineThrid) {
        	System.out.println("삼각형을 만들 수 있겠군요!");
        } else if(lineFirst+lineSecond>lineThrid) {
        	System.out.println("삼각형을 못 만들겠네요..");
        } else {
        	System.out.println("입력 오류입니다");
        }
	}
	
}



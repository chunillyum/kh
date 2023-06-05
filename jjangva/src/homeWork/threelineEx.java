package homeWork;
import java.util.Scanner;
public class threelineEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("각 변의 길이를 말해주세요");
		int firstLine = sc.nextInt();
		int secondLine = sc.nextInt();
		int thirdLine = sc.nextInt();

		if(thirdLine < firstLine + secondLine) {
		System.out.println("삼각형을 만들 수 있겠군요!");
		}
		else if (thirdLine > firstLine + secondLine) {
		System.out.println("못 만듭니다!");
		}
        }
	}
	//좆나 잘못함. 순서 상관 없이 가장 작은 변 두 개의 합을 알아내서 가장 큰 변보다 길어야만 만들 수 있게끔 해야했음
	//조건문 떡칠 했어야함.



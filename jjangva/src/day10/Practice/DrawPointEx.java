package day10.Practice;
import java.util.Scanner;
public class DrawPointEx {
//좌표를 입력하면 마우스 커서를 해당 좌표의 위칠 이동시키는 프로그램.
	public static void main(String[] args) {
		System.out.println("커서를 어디로 이동시킬까요? X, Y");
		Scanner sc = new Scanner(System.in);
		int userX = sc.nextInt();
		int userY = sc.nextInt();
		Point mousePoint = new Point(userY, userY);
		System.out.println("커서가 이동되었습니다. 현재 커서 위치: "  + mousePoint.mouse(userX, userY));
	}

}

class Point {
	//x좌표 y좌표<<현재 이곳에선 멤버변수
	private int x;
	private int y;
	
	public Point(int x, int y) {//이건 생성자(매개변수)
		this.x = x;
		this.y = y;
	}
	public static String mouse(int x, int y) {
		String result = "X: " + x + " y: " + y;
		return result;
	}
	
}
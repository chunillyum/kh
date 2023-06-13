package day10.Practice;
import java.util.Scanner;
public class DrawPointEx2 {
//좌표를 입력하면 마우스 커서를 해당 좌표의 위칠 이동시키는 프로그램.
	public static void main(String[] args) {
		System.out.println("커서를 어디로 이동시킬까요? X, Y");
		Scanner sc = new Scanner(System.in);
		int userX = sc.nextInt();
		int userY = sc.nextInt();
		moint mousePoint = new moint(userX, userY);//moint 클래스에 int형 변수 userX랑 userY를 전달한 후 moint클래스에서 실행한 결과를  mousepoint 객체에 담음.
		mousePoint.move(userX, userY);//mousepoint객체(moint 클래스)의 move 메소드 매개변수 전달값으로 유저의 입력값인 userX와 userY를 전달
	}

}

class moint {
	//x좌표 y좌표<<현재 이곳에선 멤버변수
	private int x;//getter랑 setter를 만들면 밑줄이 사라지는데 왜 만들어야 하는지는 모르겠음.
	private int y;
	
	public moint(int x, int y) {//이건 생성자(매개변수)
		this.x = x;
		this.y = y;
	}
	public void move(int x, int y) {
		System.out.println("커서가 이동되었습니다. 현재 커서 위치: X = " + x + " y = " + y);
	}
	
}
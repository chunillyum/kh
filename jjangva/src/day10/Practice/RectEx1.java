package day10.Practice;

public class RectEx1 {

	public static void main(String[] args) {
		Rect1 r = new Rect1(0,0,10,10);
		r.print();
		r.move(10, 10);
		r.print();
		r.resize(10, 10, 20, 20);
		r.print();
		r.resize(0, 0, 30, 30);
		r.print();
	}

}
class Rect1{
	//멤버변수
	//왼쪽 윗점 x좌표, 왼쪽 윗점 y 좌표
	//오른쪽 아랫점 y좌표, 오른쪽 아랫점y좌표
	private int leftUpX, leftUpY;
	private int rightDownX, rightDownY;
	//생성자
	public Rect1(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		this.leftUpX = leftUpX;
		this.leftUpY = leftUpY;
		this.rightDownX = rightDownX;
		this.rightDownY = rightDownY;
	}	
	//getter, setter 생략
	//메소드
	/*
	 * 사각형 정보를 출력하는 메소드
	 * 매개변수:업슴
	 * 리턴타입:void
	 * 메소드명:print
	 */
	public void print() {
		System.out.println("======");
		System.out.println("Lu point : " + leftUpX + ", " + leftUpY);
		System.out.println("Ru point : " + rightDownX + ", " + rightDownY);
	}
	/*
	 * 사각형 정보를 출력하는 메소드
	 * 매개변수: 이동시킬 왼쪽 윗점 - int x, int y
	 * 리턴타입:void
	 * 메소드명:move
	 */
	public void move(int x, int y) {
		int dx = leftUpX - x;//이동한 x좌표 거리
		int dy =  leftUpY - y;//이동한 y좌표 거리
		leftUpX = x;
		leftUpY = y;
		rightDownX =  rightDownX - dx;
		rightDownY = rightDownY - dy;
	}
	/*
	 * 사각형의 크기를 변경하는 메소드
	 * 매개변수 : 변경된 사각형의 왼쪽 위의 x,y 좌표와 가로,세로가 주어지면 사각형의 크기를 변경하는 메소드
	 * =>int x, int y, int w, int h
	 * 리턴타입 : void
	 * 메소드명 : resize
	 */
	public void resize(int x, int y, int w, int h) {
		leftUpX = x;
		leftUpY = y;
		rightDownX = x+w;
		rightDownY = x+h;
		
	}
}

class Rect2{
	//멤버변수
	private Point leftUp, rightDown;//도대체 Point라는 자료는 뭐임?

	public Rect2(Point leftUp, Point rightDown) {
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	}
	public Rect2(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		leftUp = new Point(leftUpX, leftUpY);
		rightDown = new Point(rightDownX, rightDownY);
	}
	public void print() {
		System.out.println("======");
		System.out.println("Lu point : ");
		leftUp.print();
		System.out.println("Ru point : ");
		rightDown.print();
	}//아니 도대체 이게 뭔 개 씨발같은 소리임?
	
}
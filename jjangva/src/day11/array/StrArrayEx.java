package day11.array;

public class StrArrayEx {

	public static void main(String[] args) {
//		String names[] = new String[] {"음","흠","아","하","시발"};
//		for(String name : names) {
//			System.out.println(name);
		Point pointArr[]=new Point[5];
		pointArr[0]=new Point(0,0);
		pointArr[1]=new Point(10,10);
		pointArr[2]=new Point(8,4);
		pointArr[3]=new Point(9,2);
		pointArr[4]=new Point(1,8);
		for(Point pt : pointArr) {
			pt.print();
		}
		}
	}

class Point{
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point pt) {
		x=pt.x;
		y=pt.y;
	}
	public void print() {
		System.out.println(x + " , " + y);
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
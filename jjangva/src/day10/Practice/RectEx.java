package day10.Practice;

public class RectEx {
//클래스를 생성 후 main메소드 안에 생성될 객체가 실행할 활동들을 만들어야 한다.
	public static void main(String[] args) {
		nemo Nemo1 = new nemo("연필", "검정", 30);
		Nemo1.print();
		nemo Nemo30 = new nemo("볼펜", "빨강", 50);
		Nemo30.print();
	}

}

class nemo {
	private String pen;
	private String color;
	private int px;
	
	public nemo(String pen, String color, int px) {
		this.pen = pen;
		this.color = color;
		this.px = px;
	}

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}
	public void print() {
		System.out.println("펜 종류 : " + pen);
		System.out.println("펜 색상 : " + color);
		System.out.println("펜 두께 : " + px);
	}
	
}

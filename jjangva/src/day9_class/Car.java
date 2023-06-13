package day9_class;
/*
 * Car //자동차
 * String name //자동차명
 * String company//제조사
 * int year//연식
 * int speed//속력
 * String gear//기어, p r d n 주차 후진 주행 중립
 * boolean power //전원 온오프 유무
 */
public class Car {
	//Car클래스의 멤버변수
	//멤버변수는 보통 보안성을 위해 private를 사용
	private String name;//자동차명
	private	String company;//제조사
	private int year;//연식
	private int speed;//속력
	private char gear;//기어, p r d n 주차 후진 주행 중립
	private boolean power;//전원 온오프 유무
	//생성자
	public Car(String _name, String _company, int _year) {
		name = _name;//this를 사용한다면 this.name = name; 으로 가능. this.name<<은 class의 멤버변수, 그냥 name은 매개변수
		company = _company;
		year = _year;
		gear = 'p';
	}
	public void printInfo() {
		System.out.println("자동차 조회");
		System.out.println("모델 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println("연식 : " + year);
		System.out.println("전원 : " + (power?"on" : "off"));
		System.out.println("기어 : " + gear);
		System.out.println("속력 : " + speed);
	}
	/*
	 * 속력이 1 증가/1감소하는 메소드
	 * 매개변수 :  증가할건지 = boolean positive
	 * 리턴타입: 없음
	 * 
	 */
	public void speedChange(boolean positive) {
		//전원이 꺼져있으면 종료
		if(!power) {
			return;
		}
		//기어가 중립 또는 주차중이면 종료
		if (gear == 'n' || gear == 'p'){
			return;
		}
		//속력이 증가하는 경우이면
		if(positive) {
			speed+=1;
		}
		//속력이 감소하는 경우이고 속력이 0보다 크면
		else if(speed > 0) {
			speed -=1;
		}		
	}
	/*
	 * 자동차 시동을 켜거나 끄는 메소드
	 */
	public void powerCheck() {
		if(!power) {
			power = true;
		}
		else if(gear=='p') {
			power = false;
		}
	}
	public void setGear(char gear1) {
		gear = gear1;
	}
	
}

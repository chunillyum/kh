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
public class CarMain {

	public static void main(String[] args) {
		Car carInfo = new Car("뉴 아반떼", "현대", 2023);
		carInfo.powerCheck();
		carInfo.setGear('d');
		carInfo.printInfo();
		carInfo.speedChange(true);
		//속도를 1 높이려면 한 줄씩 써야댐? 존나 비효율적인 듯
		carInfo.printInfo();
	}

}

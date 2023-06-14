package day11.practice;

public class ArrayRandomEx {

	public static void main(String[] args) {
		int[] randomNum = new int[3];//인덱스값이 3개인 배열 선언
		for(int i = 0; i<3; i++) {
			randomNum[i] = (int)(Math.random()*10)+1;//랜덤한 숫자를 배열에 담아 출력
			System.out.println(randomNum[i]);
		}
	}

}

package day6;

public class MultiplicationEx {

	public static void main(String[] args) {//자바 구구단
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
	}

}

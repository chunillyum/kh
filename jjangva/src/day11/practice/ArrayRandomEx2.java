package day11.practice;
//3개의 인덱스값을 가진 배열에 랜덤한 수를 담아 출력하시오(단, 3개의 인덱스값이 중복되지 않게)
public class ArrayRandomEx2 {
	public static void main(String[] args) {
		int[] randomNum = new int[3];
		for(int i = 0; i<3; i++) {
			randomNum[i] = (int)(Math.random()*10)+1;
			if(randomNum[0]==randomNum[1]) {
				randomNum[0]=0;
			}
			else if(randomNum[0]==randomNum[2]) {
				randomNum[0]=0;
			}
			else if(randomNum[1]==randomNum[2]) {
				randomNum[2]=0;
			}
			System.out.println(randomNum[i]);
		}//존나 하드코딩(인덱스가 100개면 그 경우의 수를 다 if문에 넣을 거임?)
		System.out.println("========");
		printArray(randomNum);
		System.out.println("=====");
	}
	public static void printArray(int[] randomNum) {
		int i;
		for(i = 0; i<randomNum.length; i++) {
		System.out.println(randomNum[i]);
		}
	}

}
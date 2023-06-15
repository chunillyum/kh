package day11.practice;
import java.util.Scanner;
public class day11_BaseballGame2 {

	public static void main(String[] args) {
		int[] randomCount = new int[3];
		int[] userCount = new int[3];
		int strike = 0;
		int ball = 0;

		for (int i = 0; i < randomCount.length; i++) {
			randomCount[i] = (int) (Math.random() * 9 + 1); // 랜덤숫자를 배열에 넣기
			for (int j = 0; j < i; j++) {
				// i인덱스에 들어갈 숫자를 반복문을통해 같은숫자가 있는지 확인
				if (randomCount[j] == randomCount[i]) {
					// 중복이 있으면 반복문을 빠져나가고 전 단계로 이동
					i--;
					break;
				}
			}
		}
		for(int e : randomCount) {
			System.out.println(e);
		}
		while (true) {
			System.out.println("1~9 사이의 정수를 중복되지 않게 입력해주세요");
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < userCount.length; i++) {
				userCount[i] = sc.nextInt();
				for (int j = 0; j < i; j++) {
					if (userCount[j] == userCount[i]) {
						System.out.println("중복된 숫자를 입력했습니다");
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < randomCount.length; i++) {
				for (int j = 0; j < userCount.length; j++) {
					// numArr의 i번째 인덱스와 inputArr의 모든 원소들을 비교
					if (randomCount[i] == userCount[j] && i == j) {
						// 같은 숫자가 있고 인덱스도 같으면 스트라이크
						strike++;
					} else if (randomCount[i] == userCount[j] && i != j) {
						// 같은 숫자만 있으면 볼
						ball++;
					}
				}
			}
			System.out.println(strike + "스트라이크" + ball + "볼");
			if (strike == 3) {
				System.out.println("정답!");
				break;
			}
			strike = 0;
			ball = 0;
		}
	}

}

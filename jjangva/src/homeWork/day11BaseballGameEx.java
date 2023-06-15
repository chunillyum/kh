package homeWork;

import java.util.Scanner;

public class day11BaseballGameEx {
	//1~9사이의 중복되지 않은 세 수를 맞추는 게임
	//B: 같은 숫자가ㅏ 있지만 위치가 다름, S: 같은 숫자가 있고 위치가 같음 30: 일치하는 숫자가 하나도 없음.
	//랜덤 1 9 5 사용자 1 2 3 = 1s
	// 사용자 4 5 6 = 1b
	//사용자 1 2 9 = 1b1s
	public static void main(String[] args) {
		int numArr[] = new int[3]; //랜덤으로 뽑은 숫자를 넣기위한 length 3인 빈 배열
		int inputArr[] = new int[3]; // 유저가 입력한 숫자를 넣기위한 length 3인 빈 배열
		int strike = 0; //입력한 값의 strike를 저장받을 변수
		int ball = 0; //입력한 값의 ball을 입력받을 변수
		// 과정1 : 배열의 길이만큼 반복문을 돌려서 랜덤숫자를 뽑고, 중복이 있는지 확인
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 9 + 1); // 랜덤숫자를 배열에 넣기
		    	for(int j = 0; j < i; j++) {
		        // i인덱스에 들어갈 숫자를 반복문을통해 같은숫자가 있는지 확인
		        	if(numArr[j] == numArr[i]) {
		            	//중복이 있으면 반복문을 빠져나가고 전 단계로 이동
		                	i--; 
		                    	break;
		                }
		        }
		}
//		for(int x : numArr) {
//			//랜덤숫자 확인
//			System.out.print(x + " ");
//		}
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("1~9사이의 정수를 입력하세요 : ");
	    		//과정2 : inputArr.length만큼 반복해 유저가 입력한 숫자를 순서대로 inputArr에 넣는다.
	        	for(int i  = 0; i < inputArr.length; i++) {
	                    	inputArr[i] = s.nextInt(); // scanner메서드를 이용해 inputArr에 유저가 입력한 숫자 넣기
	                        for(int j = 0; j < i; j++) {
	                        	if(inputArr[j] == inputArr[i]) {
	                            	//유저가 입력한 i인덱스에 들어갈 숫자가 중복된 숫자인지 확인
	                                	System.out.println("중복된 값을 입력했습니다.");
	                                    	i--;
	                                        break;
	                                }
				}
			}
	                //과정3 : 유저가 입력한 숫자와 정답숫자를 비교하여 Strike인지 Ball인지 구분한다.
	                for(int i = 0; i < numArr.length; i++) {
	                	for(int j = 0; j < inputArr.length; j++) {
	                    	//numArr의 i번째 인덱스와 inputArr의 모든 원소들을 비교
	                        	if(numArr[i] == inputArr[j] && i == j) {
	                            	//같은 숫자가 있고 인덱스도 같으면 스트라이크
	                                	strike++;
	                                 }else if(numArr[i] == inputArr[j] && i != j) {
	                                 //같은 숫자만 있으면 볼
	                                 	ball++;
					}
				}
			}

			System.out.println(strike + "스트라이크" + ball + "볼");
	        	if(strike == 3) {
	            		System.out.println("정답!");
	                    	break;
			}
	        	strike = 0;
	        	ball = 0;
			}
		}
}


package array;

public class BaseballGames {
	
	public static void Array() {
		int[] randomCount = new int[3];
		
	for(int i=0; i<randomCount.length; i++) {
		randomCount[i] = (int)(Math.random()*9)+1;//랜덤값 1~9를 randomCount[]배열 안에 저장
		for(int j=0; j<i; j++) {//중복 숫자 찾기
			if(randomCount[j]==randomCount[i]) {
				i--;//숫자가 중복으로 저장되면 그 전 단계로 되돌아감
				break;
			}
		}
	}
	for(int x : randomCount) {
	//랜덤숫자 확인
	System.out.println(x + " ");
}
	}
	
	public static void main(String[] args) {
		Array();
	}
		

}

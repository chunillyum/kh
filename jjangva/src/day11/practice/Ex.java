package day11.practice;
import java.util.Scanner;
public class Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input : ");
		int num = sc.nextInt();
		div(num);
	}
	
	public static void div(int nums) {
		int count = 0;//카운트라는 변수 생성
		int[] arr1 = new int[10];//배열 생성(인덱스값이 10개인 배열 생성)
		for(int i = 1; i<nums; i++) {//i가 nums(main에서 준 입력값보다 작을 때 i++)
			if(nums%i == 0) {//i가 nums의 약수라면
				arr1[count] = i;//count라는 변수는 i의 값을 가진채 arr1 인덱스에 저장된다
				count++;//그리고 count를 계속 더함.
				}
			if(count==arr1.length) {//count의 수가 arr1 배열의 길이와 같아지면 break
				break;
			}
			}
		for(int i=0; i<count; i++) {//i가(위 for문 속 i와는 다른 변수임) count(저장된 인덱스 수)보다 작을 때 i++
			System.out.println(arr1[i]);//arr의 값 출력
		}
	}
}
//약수 구하는 예제임
//public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//System.out.println("input number");
//int num = sc.nextInt();
//for (int i = 1; i <= num; i++) {
//	if (num % i == 0) {//num을 나눈 값이 i이고 그게 0일때 조건을 충족하여 if문 안의 출력문 실행
//		//그게 아니라면 다시 i++한 채로 for문 실행
//		System.out.println(i);
//	}

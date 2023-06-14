package day11.array;

public class ArrayCopyEx {

	public static void main(String[] args) {
		int arr1[] = new int[]	{1,2,3,4,5};
		int arr2[] = arr1;//이 코드는 배열을 arr1과 arr2가 공유
		arr2[0]=10;//이러면 arr1의 0 값도 10으로 바뀌어버림
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		arr2[0] = 1;
		
		arr2 = new int[arr1.length];//복사를 위한 배열 생성
		
		System.out.println("=====");
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		arr2[0]=10;//반복문을 통해 복사된 arr2의 0을 수정해도 arr1은 안 변함 
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		
		
		int arr3[]=new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);//복사할 배열, 그 배열의 수정할 목표 인덱스값, 현재 배열, 현재 배열의 인덱스값,
		//배열의 크기
		arr3[0]=10;
		System.out.println("=====");
		for(int tmp : arr3) {
			System.out.println(tmp);
		}
	}

}

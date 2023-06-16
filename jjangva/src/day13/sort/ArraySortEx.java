package day13.sort;

import array.Array;
//강사님 깃 가서 Array패키지 배껴온 후 거기다가 이 클래스파일 추가하기
public class ArraySortEx {
//배열 정렬
	public static void main(String[] args) {
		int arr[]= {84, 2, 5, 92, 41, 1293, 348};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
			Array.printArray(arr);
		}
	}

}

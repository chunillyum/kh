package array;

public class Array {

		
	public static void printArray(int[] randomNum) {
		int i;
		for (i = 0; i < randomNum.length; i++) {
			System.out.print(randomNum[i] + (i==randomNum.length-1?"\n": ","));
		}
	}

}

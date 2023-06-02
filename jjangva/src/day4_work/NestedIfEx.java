package day4_work;

public class NestedIfEx {

	public static void main(String[] args) {//if문 중첩 (알아두기)(if else로 대체 가능)
		int num = 4;
		
		if(num%2 == 0) {
			if(num%3 ==0) {
				System.out.println("6의 배수");
			}
		
		else {
			System.out.println("2의 배수");
		      }	
	}
		else if(num%3 == 0 ) {
			System.out.println("3의 배수");
		}
		else {System.out.println("해당 없음");
	}
	}

}

package day5.switchEx;

public class EvenEx {

	public static void main(String[] args) {
		int num = 4;
		switch(num % 2) {
		case 0:
		System.out.println(num + "is a even number");
		break;
		default:
			System.out.println(num + "is a odd number");
		}
	}

}

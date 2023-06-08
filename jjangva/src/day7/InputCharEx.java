package day7;
import java.util.Scanner;
public class InputCharEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		for(; ;) {
			System.out.println("input char (exit: q) ");
			ch=sc.next().charAt(0);
			if(ch=='q') {
				break;
			}
		}
	}

}
